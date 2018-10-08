package lk.ijse.spring.rest.maven.dto;

public class OrderDetail_PKDTO {
    private int itemCode;
    private int orderId;

    public OrderDetail_PKDTO() {
    }

    public OrderDetail_PKDTO(int itemCode, int orderId) {
        this.itemCode = itemCode;
        this.orderId = orderId;
    }
}
