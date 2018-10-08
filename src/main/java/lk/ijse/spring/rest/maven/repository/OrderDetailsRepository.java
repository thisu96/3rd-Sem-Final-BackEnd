package lk.ijse.spring.rest.maven.repository;

import lk.ijse.spring.rest.maven.entity.OrdersDetails;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderDetailsRepository extends JpaRepository<OrdersDetails, String> {
}
