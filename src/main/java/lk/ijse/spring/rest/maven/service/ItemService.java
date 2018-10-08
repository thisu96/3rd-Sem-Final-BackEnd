package lk.ijse.spring.rest.maven.service;


import lk.ijse.spring.rest.maven.dto.ItemDTO;
import org.springframework.core.io.InputStreamResource;
import org.springframework.http.ResponseEntity;
import org.springframework.web.multipart.MultipartFile;

import java.util.ArrayList;

public interface ItemService {

    public ArrayList<ItemDTO> getAllItems();

    public ItemDTO getItem(int itmCode);

    public boolean deleteItem(String itemName);

    public boolean saveItem(ItemDTO itemDTO);

    public int getAllItemsCount();

    public int uploadFile(MultipartFile[] files);

    public ResponseEntity<InputStreamResource> downloadFile(String path);

}
