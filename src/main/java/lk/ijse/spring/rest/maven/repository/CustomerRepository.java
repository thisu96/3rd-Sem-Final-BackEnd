package lk.ijse.spring.rest.maven.repository;

import lk.ijse.spring.rest.maven.entity.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CustomerRepository extends JpaRepository<Customer, String> {
}
