package lk.ijse.spring.rest.maven.service.impl;

import lk.ijse.spring.rest.maven.dto.OrderDetailsDTO;
import lk.ijse.spring.rest.maven.dto.OrdersDTO;
import lk.ijse.spring.rest.maven.entity.*;
import lk.ijse.spring.rest.maven.repository.CustomerRepository;
import lk.ijse.spring.rest.maven.repository.ItemRepository;
import lk.ijse.spring.rest.maven.repository.OrderDetailsRepository;
import lk.ijse.spring.rest.maven.repository.OrdersRepository;
import lk.ijse.spring.rest.maven.service.PlaceOrderService;
import lk.ijse.spring.rest.maven.util.EmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class PlaceOrderServiceImpl implements PlaceOrderService {

    @Autowired
    private OrdersRepository ordersRepository;
    @Autowired
    private CustomerRepository customerRepository;
    @Autowired
    private ItemRepository itemRepository;
    @Autowired
    private OrderDetailsRepository orderDetailsRepository;

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean placeOrder(OrdersDTO ordersDTO) {
        System.out.println(ordersDTO.getCustomer().getUserName());
        Customer customer = customerRepository.findById(ordersDTO.getCustomer().getUserName()).get();
        System.out.println("service run");
        System.out.println(ordersDTO.getCustomer().getUserName());
        System.out.println(customer);
        Orders orders = new Orders(ordersDTO.getOrderDate(),
                ordersDTO.getPriority(),
                ordersDTO.getEmail(),
                ordersDTO.getDeliveryAddress(),
                ordersDTO.getDeliveryFee(),
                ordersDTO.getDeliveryTime(),
                customer);
        System.out.println("service"+orders);
        ordersRepository.save(orders);

        List<OrderDetailsDTO> orderDetailsDTOList = ordersDTO.getOrderDetailDTOs();

        for (OrderDetailsDTO ordersDetails : orderDetailsDTOList){
            Item item = itemRepository.findById(ordersDetails.getItem().getItemCode()).get();
            item.setQtyOnHand(ordersDetails.getItem().getQtyOnHand()-ordersDetails.getOrder_qty());
            itemRepository.save(item);

            OrdersDetails ordersDetails1 = new OrdersDetails();
            ordersDetails1.setOrder_qty(ordersDetails.getOrder_qty());
            ordersDetails1.setTotal_amount(ordersDetails.getTotal_amount());
            ordersDetails1.setItem(item);
            ordersDetails1.setOrders(orders);

            OrderDetail_PK orderDetail_pk = new OrderDetail_PK(item.getItemCode(),orders.getOrderId());
            ordersDetails1.setOrderDetail_pk(orderDetail_pk);
            System.out.println("order details pk"+ orderDetail_pk);
            orderDetailsRepository.save(ordersDetails1);

            String text="Customer Name :"+ordersDTO.getCustomer().getCustomerName()+"\n" +
                    "Date :"+ordersDTO.getOrderDate()+"\n" +
                    "Order Items List :"+ordersDTO.getOrderDetailDTOs()+"\n" +
                    "Total Amount :"+ordersDetails.getTotal_amount()+"";
            EmailService.getEmailService().sendEmail(text,customer.getSystemEmail());

        }
        return true;
    }
}
