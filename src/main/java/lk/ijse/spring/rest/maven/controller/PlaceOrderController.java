package lk.ijse.spring.rest.maven.controller;

import lk.ijse.spring.rest.maven.dto.OrdersDTO;
import lk.ijse.spring.rest.maven.service.PlaceOrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/orders")
public class PlaceOrderController {

    @Autowired
    private PlaceOrderService service;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean placeOrder(@RequestBody OrdersDTO ordersDTO) {
        System.out.println("controller"+ ordersDTO);
        System.out.println(ordersDTO.getOrderDetailDTOs());
        return service.placeOrder(ordersDTO);
    }


}
