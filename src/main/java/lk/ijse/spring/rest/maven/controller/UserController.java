package lk.ijse.spring.rest.maven.controller;

import lk.ijse.spring.rest.maven.dto.CustomerDTO;
import lk.ijse.spring.rest.maven.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

@RestController
@CrossOrigin
@RequestMapping(value = "api/v1/login")
public class UserController {

    @Autowired
    private CustomerService customerService;

    @PostMapping(consumes = MediaType.APPLICATION_JSON_VALUE, produces = MediaType.APPLICATION_JSON_VALUE)
    public boolean canAuthenticate(@RequestBody CustomerDTO customerDTO){
        System.out.println(customerDTO.getUserName()+ customerDTO.getPassword());
        return customerService.canAuthenticate(customerDTO.getUserName(), customerDTO.getPassword());
    }
}
