package lk.ijse.spring.rest.maven.dto;

import java.util.List;

public class OrdersDTO {
    private int orderId;
    private String orderDate;
    private String priority;
    private String email;
    private String deliveryAddress;
    private double deliveryFee;
    private String deliveryTime;
    private CustomerDTO customer;
    private List<OrderDetailsDTO> orderDetailDTOs;

    public OrdersDTO() {
    }

    public OrdersDTO(int orderId, String orderDate, String priority, String email, String deliveryAddress, double deliveryFee, String deliveryTime, CustomerDTO customer, List<OrderDetailsDTO> orderDetailDTOs) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.priority = priority;
        this.email = email;
        this.deliveryAddress = deliveryAddress;
        this.deliveryFee = deliveryFee;
        this.deliveryTime = deliveryTime;
        this.customer = customer;
        this.orderDetailDTOs = orderDetailDTOs;
    }

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
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
                ", email='" + email + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", deliveryFee=" + deliveryFee +
                ", deliveryTime='" + deliveryTime + '\'' +
                ", customer=" + customer +
                ", orderDetailDTOs=" + orderDetailDTOs +
                '}';
    }
}
