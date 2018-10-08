package lk.ijse.spring.rest.maven.dto;

public class OrderDetailsDTO {
    private double order_qty;
    private double total_amount;
    private ItemDTO item;

    public OrderDetailsDTO() {
    }

    public OrderDetailsDTO(double order_qty, double total_amount, ItemDTO item) {
        this.order_qty = order_qty;
        this.total_amount = total_amount;
        this.item = item;
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

    public ItemDTO getItem() {
        return item;
    }

    public void setItem(ItemDTO item) {
        this.item = item;
    }

    @Override
    public String toString() {
        return "OrderDetailsDTO{" +
                "order_qty=" + order_qty +
                ", total_amount=" + total_amount +
                ", item=" + item +
                '}';
    }
}
