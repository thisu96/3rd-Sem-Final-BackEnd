package lk.ijse.spring.rest.maven.service;

import lk.ijse.spring.rest.maven.dto.OrderListDTO;

import java.util.ArrayList;
import java.util.List;

public interface OrderListService {

    public List<OrderListDTO> getAllOrderList();

}
