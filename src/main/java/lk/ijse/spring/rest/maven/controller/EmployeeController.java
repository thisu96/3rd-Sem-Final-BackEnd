package lk.ijse.spring.rest.maven.controller;

import lk.ijse.spring.rest.maven.dto.EmployeeDTO;
import lk.ijse.spring.rest.maven.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;

@RestController
@CrossOrigin
@RequestMapping(value="/api/v1/employee")
public class EmployeeController {

    @Autowired
    private EmployeeService employeeService;

    @GetMapping(produces = MediaType.APPLICATION_JSON_VALUE)
    public ArrayList<EmployeeDTO> getAllEmployees() {
        return employeeService.getAllEmployees();
    }

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean saveEmployee(@RequestBody EmployeeDTO employeeDTO) {
        return employeeService.saveEmployee(employeeDTO);
    }

    @GetMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public EmployeeDTO getEmployee(@PathVariable("id") String userName) {
        return employeeService.getEmployee(userName);
    }


    @DeleteMapping(value = "/{id}", produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean deleteEmployee(@PathVariable("id") String userName) {
        return employeeService.deleteEmployee(userName);
    }

    @PostMapping(value="api/v1/admin", consumes = MediaType.APPLICATION_JSON_VALUE,
            produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody EmployeeDTO employeeDTO){
        System.out.println("login cus controller");
        return employeeService.canAuthenticate(employeeDTO.getUserName(), employeeDTO.getPassword());
    }

}
