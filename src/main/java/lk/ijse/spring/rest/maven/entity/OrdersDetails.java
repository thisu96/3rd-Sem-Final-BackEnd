package lk.ijse.spring.rest.maven.entity;

import javax.persistence.*;

@Entity
public class OrdersDetails {
    private double order_qty;
    private double total_amount;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name="itemCode",referencedColumnName = "itemCode",insertable = false,updatable = false)
    private Item item;
    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "orderId", referencedColumnName = "orderId",insertable = false,updatable = false)
    private Orders orders;
    @EmbeddedId
    private OrderDetail_PK orderDetail_pk;

    public OrdersDetails() {
    }

    public OrdersDetails(double order_qty, double total_amount, Item item, Orders orders, OrderDetail_PK orderDetail_pk) {
        this.order_qty = order_qty;
        this.total_amount = total_amount;
        this.item = item;
        this.orders = orders;
        this.orderDetail_pk = orderDetail_pk;
    }

    public double getOrder_qty() {
        return order_qty;
    }

    public void setOrder_qty(double order_qty) {
        this.order_qty = order_qty;
    }

    public double getTotal_amount() {
        return total_amount;
    }

    public void setTotal_amount(double total_amount) {
        this.total_amount = total_amount;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public Orders getOrders() {
        return orders;
    }

    public void setOrders(Orders orders) {
        this.orders = orders;
    }

    public OrderDetail_PK getOrderDetail_pk() {
        return orderDetail_pk;
    }

    public void setOrderDetail_pk(OrderDetail_PK orderDetail_pk) {
        this.orderDetail_pk = orderDetail_pk;
    }

    @Override
    public String toString() {
        return "OrdersDetails{" +
                "order_qty=" + order_qty +
                ", total_amount=" + total_amount +
                ", item=" + item +
                ", orders=" + orders +
                ", orderDetail_pk=" + orderDetail_pk +
                '}';
    }
}
