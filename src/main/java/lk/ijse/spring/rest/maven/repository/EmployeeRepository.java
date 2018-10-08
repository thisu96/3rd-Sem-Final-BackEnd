package lk.ijse.spring.rest.maven.repository;

import lk.ijse.spring.rest.maven.entity.Employee;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmployeeRepository extends JpaRepository<Employee, String> {
}
