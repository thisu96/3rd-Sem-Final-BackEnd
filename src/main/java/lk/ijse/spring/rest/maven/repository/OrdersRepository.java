package lk.ijse.spring.rest.maven.repository;

import lk.ijse.spring.rest.maven.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
    @Query(value = "select c.userName, o.orderId, o.orderDate, o.deliveryAddress, o.deliveryFee, o.deliveryTime, od.itemCode, od.order_qty, od.total_amount from Orders o,Customer c,OrdersDetails od where c.userName=o.customer_userName && o.orderId=od.orderId", nativeQuery = true)
    List<Object[]> getAllOrders();
}

