package lk.ijse.spring.rest.maven.service.impl;

import lk.ijse.spring.rest.maven.dto.EmployeeDTO;
import lk.ijse.spring.rest.maven.entity.Employee;
import lk.ijse.spring.rest.maven.repository.EmployeeRepository;
import lk.ijse.spring.rest.maven.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class EmployeeServiceImpl implements EmployeeService {

    @Autowired
    private EmployeeRepository employeeRepository;

    @Override
    public ArrayList<EmployeeDTO> getAllEmployees() {
        List<Employee> employees = employeeRepository.findAll();

        ArrayList<EmployeeDTO> alEmployees = new ArrayList<>();
        for ( Employee employee : employees ) {
            EmployeeDTO employeeDTO = new EmployeeDTO(employee.getUserName(),
                    employee.getEmpName(),
                    employee.getAddress(),
                    employee.getContact(),
                    employee.getEmail(),
                    employee.getEmpSalary(),
                    employee.getPassword(),
                    employee.getConfirmPassword());
            alEmployees.add(employeeDTO);
        }
        return alEmployees;
    }

    @Override
    public EmployeeDTO getEmployee(String userName) {
        Optional<Employee> employee = employeeRepository.findById(userName);
        EmployeeDTO employeeDTO = new EmployeeDTO(employee.get().getUserName(),
                employee.get().getEmpName(),
                employee.get().getAddress(),
                employee.get().getContact(),
                employee.get().getEmail(),
                employee.get().getEmpSalary(),
                employee.get().getPassword(),
                employee.get().getConfirmPassword());
        return employeeDTO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteEmployee(String userName) {
        employeeRepository.deleteById(userName);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveEmployee(EmployeeDTO employeeDTO) {
       Employee employee = new Employee(employeeDTO.getUserName(),
               employeeDTO.getEmpName(),
               employeeDTO.getAddress(),
               employeeDTO.getContact(),
               employeeDTO.getEmail(),
               employeeDTO.getEmpSalary(),
               employeeDTO.getPassword(),
               employeeDTO.getConfirmPassword());
       employeeRepository.save(employee);
       return true;
    }

    @Override
    public int getAllEmployeesCount() {
        return 0;
    }

    @Override
    public boolean canAuthenticate(String username, String password) {
        System.out.println("login customer service");

        boolean exists = employeeRepository.existsById(username);

        if (!exists){
            return false;
        }

        Employee employee = employeeRepository.findById(username).get();

        return employee.getPassword().equals(password);
    }
}
