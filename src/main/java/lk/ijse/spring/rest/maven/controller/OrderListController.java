package lk.ijse.spring.rest.maven.controller;

import lk.ijse.spring.rest.maven.dto.OrderListDTO;
import lk.ijse.spring.rest.maven.repository.OrdersRepository;
import lk.ijse.spring.rest.maven.service.OrderListService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@CrossOrigin
@RestController
@RequestMapping(value = "/api/v1/orderList")
public class OrderListController {

    @Autowired
    private OrderListService orderListService;

    @GetMapping(value = "loadData", produces = MediaType.APPLICATION_JSON_VALUE)
    public List<OrderListDTO> getAllOrderList() {
        return orderListService.getAllOrderList();
    }

}
