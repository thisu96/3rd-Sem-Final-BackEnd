package lk.ijse.spring.rest.maven.dto;

import java.util.List;

public class OrdersDTO {
    private int orderId;
    private String orderDate;
    private String priority;
    private CustomerDTO customer;
    private List<OrderDetailsDTO> orderDetailDTOs;

    public OrdersDTO() {
    }

    public OrdersDTO(int orderId, String orderDate, String priority, CustomerDTO customer, List<OrderDetailsDTO> orderDetailDTOs) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.priority = priority;
        this.customer = customer;
        this.orderDetailDTOs = orderDetailDTOs;
    }

    public OrdersDTO(String orderDate, String priority, CustomerDTO customer, List<OrderDetailsDTO> orderDetailDTOs) {
        this.orderDate = orderDate;
        this.priority = priority;
        this.customer = customer;
        this.orderDetailDTOs = orderDetailDTOs;
    }

    public int getOrderId() {
        return orderId;
    }

    public void setOrderId(int orderId) {
        this.orderId = orderId;
    }

    public String getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(String orderDate) {
        this.orderDate = orderDate;
    }

    public String getPriority() {
        return priority;
    }

    public void setPriority(String priority) {
        this.priority = priority;
    }

    public CustomerDTO getCustomer() {
        return customer;
    }

    public void setCustomer(CustomerDTO customer) {
        this.customer = customer;
    }

    public List<OrderDetailsDTO> getOrderDetailDTOs() {
        return orderDetailDTOs;
    }

    public void setOrderDetailDTOs(List<OrderDetailsDTO> orderDetailDTOs) {
        this.orderDetailDTOs = orderDetailDTOs;
    }

    @Override
    public String toString() {
        return "OrdersDTO{" +
                "orderId=" + orderId +
                ", orderDate='" + orderDate + '\'' +
                ", priority='" + priority + '\'' +
                ", customer=" + customer +
                ", orderDetailDTOs=" + orderDetailDTOs +
                '}';
    }
}
