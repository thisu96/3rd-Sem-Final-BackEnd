package lk.ijse.spring.rest.maven.entity;

import javax.persistence.*;
import java.util.List;

@Entity
public class Orders {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private int orderId;
    private String orderDate;
    private String priority;
    //@ManyToOne(cascade = CascadeType.ALL)
    @ManyToOne(cascade = CascadeType.ALL)
    private Customer customer;

    public Orders() {
    }

    public Orders(int orderId, String orderDate, String priority, Customer customer) {
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.priority = priority;
        this.customer = customer;
    }

    public Orders(String orderDate, String priority, Customer customer) {
        this.orderDate = orderDate;
        this.priority = priority;
        this.customer = customer;
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

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public String toString() {
        return "Orders{" +
                "orderId=" + orderId +
                ", orderDate='" + orderDate + '\'' +
                ", priority='" + priority + '\'' +
                ", customer=" + customer +
                '}';
    }
}
