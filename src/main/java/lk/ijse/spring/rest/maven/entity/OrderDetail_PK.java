package lk.ijse.spring.rest.maven.entity;

import javax.persistence.Embeddable;
import java.io.Serializable;

@Embeddable
public class OrderDetail_PK implements Serializable {
    private int itemCode;
    private int orderId;

    public OrderDetail_PK() {
    }

    public OrderDetail_PK(int itemCode, int orderId) {
        this.itemCode = itemCode;
        this.orderId = orderId;
    }
}
