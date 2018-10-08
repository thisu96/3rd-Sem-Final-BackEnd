package lk.ijse.spring.rest.maven.service;

import lk.ijse.spring.rest.maven.dto.CustomerDTO;

import java.util.ArrayList;

public interface CustomerService {

    public ArrayList<CustomerDTO> getAllCustomers();

    public CustomerDTO getCustomer(String userName);

    public boolean deleteCustomer(String customerName);

    public boolean saveCustomer(CustomerDTO customer);

    public int getAllCustomersCount();

    boolean canAuthenticate(String username, String password);

}
