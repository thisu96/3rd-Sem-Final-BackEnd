package lk.ijse.spring.rest.maven.service.impl;

import lk.ijse.spring.rest.maven.dto.OrderListDTO;
import lk.ijse.spring.rest.maven.entity.Item;
import lk.ijse.spring.rest.maven.repository.ItemRepository;
import lk.ijse.spring.rest.maven.repository.OrdersRepository;
import lk.ijse.spring.rest.maven.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class OrderListServiceImpl implements OrderListService {

    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private ItemRepository itemRepository;

    @Override
    public List<OrderListDTO> getAllOrderList() {
        List<Object[]> orderList = ordersRepository.getAllOrders();
        ArrayList<OrderListDTO> orderListDTOs = new ArrayList<>();
        if (orderList != null) {
            for (Object[] order : orderList) {
                OrderListDTO orderListDTO = new OrderListDTO();
                orderListDTO.setDeliveryAddress(order[3].toString());
                orderListDTO.setDeliveryFee((Double) order[4]);
                orderListDTO.setDeliveryTime(order[5].toString());
                orderListDTO.setOrderDate(order[2].toString());
                orderListDTO.setOrder_qty((Double) order[7]);
                Item item=itemRepository.findById((Integer) order[6]).get();
                orderListDTO.setItemName(item.getItemName());
                orderListDTO.setTotal_amount((Double) order[8]);
                orderListDTO.setOrderId((Integer) order[1]);
                orderListDTO.setUserName(order[0].toString());
                orderListDTOs.add(orderListDTO);
            }
        }
        return orderListDTOs;
    }
}
