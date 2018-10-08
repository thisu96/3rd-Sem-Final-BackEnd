package lk.ijse.spring.rest.maven.service;

import lk.ijse.spring.rest.maven.dto.OrdersDTO;

public interface PlaceOrderService {

    public boolean placeOrder(OrdersDTO ordersDTO);

}
