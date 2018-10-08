package lk.ijse.spring.rest.maven.service;

import lk.ijse.spring.rest.maven.dto.EmployeeDTO;

import java.util.ArrayList;

public interface EmployeeService {

    public ArrayList<EmployeeDTO> getAllEmployees();

    public EmployeeDTO getEmployee(String userName);

    public boolean deleteEmployee(String userName);

    public boolean saveEmployee(EmployeeDTO employeeDTO);

    public int getAllEmployeesCount();

    boolean canAuthenticate(String username, String password);

}
