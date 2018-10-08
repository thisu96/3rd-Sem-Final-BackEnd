package lk.ijse.spring.rest.maven.controller;

import lk.ijse.spring.rest.maven.dto.EmployeeDTO;
import lk.ijse.spring.rest.maven.service.EmployeeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping("/api/v1/admin")
public class AdminController {

    @Autowired
    private EmployeeService employeeService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody EmployeeDTO employeeDTO){
        System.out.println(employeeDTO.getUserName()+ employeeDTO.getPassword());
        return employeeService.canAuthenticate(employeeDTO.getUserName(), employeeDTO.getPassword());
    }
}
