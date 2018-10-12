package lk.ijse.spring.rest.maven.dto;

public class OrderListDTO {
    private String userName;
    private String itemName;
    private int orderId;
    private String orderDate;
    private  String deliveryAddress;
    private String deliveryTime;
    private  double deliveryFee;
    private double order_qty;
    private double total_amount;

    public OrderListDTO() {
    }

    public OrderListDTO(String userName, String itemName, int orderId, String orderDate, String deliveryAddress, String deliveryTime, double deliveryFee, double order_qty, double total_amount) {
        this.userName = userName;
        this.itemName = itemName;
        this.orderId = orderId;
        this.orderDate = orderDate;
        this.deliveryAddress = deliveryAddress;
        this.deliveryTime = deliveryTime;
        this.deliveryFee = deliveryFee;
        this.order_qty = order_qty;
        this.total_amount = total_amount;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
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

    public String getDeliveryAddress() {
        return deliveryAddress;
    }

    public void setDeliveryAddress(String deliveryAddress) {
        this.deliveryAddress = deliveryAddress;
    }

    public String getDeliveryTime() {
        return deliveryTime;
    }

    public void setDeliveryTime(String deliveryTime) {
        this.deliveryTime = deliveryTime;
    }

    public double getDeliveryFee() {
        return deliveryFee;
    }

    public void setDeliveryFee(double deliveryFee) {
        this.deliveryFee = deliveryFee;
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

    @Override
    public String toString() {
        return "OrderListDTO{" +
                "userName='" + userName + '\'' +
                ", itemName='" + itemName + '\'' +
                ", orderId=" + orderId +
                ", orderDate='" + orderDate + '\'' +
                ", deliveryAddress='" + deliveryAddress + '\'' +
                ", deliveryTime='" + deliveryTime + '\'' +
                ", deliveryFee=" + deliveryFee +
                ", order_qty=" + order_qty +
                ", total_amount=" + total_amount +
                '}';
    }
}
