package lk.ijse.spring.rest.maven.repository;

import lk.ijse.spring.rest.maven.entity.Orders;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrdersRepository extends JpaRepository<Orders, Integer> {
}
