package lk.ijse.spring.rest.maven.service.impl;

import lk.ijse.spring.rest.maven.dto.ItemDTO;
import lk.ijse.spring.rest.maven.entity.Item;
import lk.ijse.spring.rest.maven.repository.ItemRepository;
import lk.ijse.spring.rest.maven.service.ItemService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.HttpHeaders;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.web.multipart.MultipartFile;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class ItemServiceImpl implements ItemService {

    @Autowired
    private ItemRepository itemRepository;


    private String folderPath = "/home/thisu/Documents/project-data/";

    @Override
    public ArrayList<ItemDTO> getAllItems() {
        List<Item> items = itemRepository.findAll();

        ArrayList<ItemDTO> alItems = new ArrayList<>();
        for ( Item item : items) {
            //System.out.println(item.getCategory().getCategoryName());
            ItemDTO itemDTO = new ItemDTO(item.getItemCode(),
                    item.getItemName(),
                    item.getQuality(),
                    item.getDescription(),
                    item.getQtyOnHand(),
                    item.getOneKiloPrice(),
                    item.getImageUrl(),
                    item.getCategory());
            alItems.add(itemDTO);
        }
        return alItems;
    }

    @Override
    public ItemDTO getItem(int itemCode) {
        Optional<Item> item = itemRepository.findById(itemCode);
        ItemDTO itemDTO = new ItemDTO(item.get().getItemCode(),
                item.get().getItemName(),
                item.get().getQuality(),
                item.get().getDescription(),
                item.get().getQtyOnHand(),
                item.get().getOneKiloPrice(),
                item.get().getImageUrl(),
                item.get().getCategory());
        return itemDTO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteItem(String itemName) {
        itemRepository.deleteById(Integer.parseInt(itemName));
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveItem(ItemDTO itemDTO) {
//        System.out.println("aaaaaaaaaaaaaaaaaaaaaaa");
        Item item = new Item(itemDTO.getItemCode(),
                itemDTO.getItemName(),
                itemDTO.getQuality(),
                itemDTO.getDescription(),
                itemDTO.getQtyOnHand(),
                itemDTO.getOneKiloPrice(),
                itemDTO.getImageUrl(),
                itemDTO.getCategory());
        //System.out.println(itemDTO);
        itemRepository.save(item);
        return true;
    }

    @Override
    public int getAllItemsCount() {
        return 0;
    }

    @Override
    public int uploadFile(MultipartFile[] files) {
        int reply = 0;
        for (MultipartFile file : files) {
            if (file.isEmpty()) {
                reply = 1;
            }
            try {
                // Get the file and save it somewhere
                byte[] bytes = file.getBytes();
                Path path = Paths.get(folderPath + file.getOriginalFilename());
                Files.write(path, bytes);

                reply = 2;

            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        return reply;
    }

    @Override
    public ResponseEntity<InputStreamResource> downloadFile(String path) {
        File file = new File("" + folderPath + "" + path + "");
        InputStreamResource resource = null;
        try {
            resource = new InputStreamResource(new FileInputStream(file));
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }
        return ResponseEntity.ok().header(HttpHeaders.CONTENT_DISPOSITION, "attachment;filename=" +
                file.getName()).contentType(MediaType.APPLICATION_OCTET_STREAM).contentLength(file.length())
                .body(resource);
    }

}
