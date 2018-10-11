package lk.ijse.spring.rest.maven.service.impl;

import lk.ijse.spring.rest.maven.dto.CustomerDTO;
import lk.ijse.spring.rest.maven.entity.Customer;
import lk.ijse.spring.rest.maven.repository.CustomerRepository;
import lk.ijse.spring.rest.maven.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Propagation;
import org.springframework.transaction.annotation.Transactional;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@Transactional(propagation = Propagation.SUPPORTS, readOnly = true)
public class CustomerServiceImpl implements CustomerService {

    @Autowired
    private CustomerRepository customerRepository;

    @Override
    public ArrayList<CustomerDTO> getAllCustomers() {
        List<Customer> customers = customerRepository.findAll();

        ArrayList<CustomerDTO> alCustomers = new ArrayList<>();
        for ( Customer customer : customers ) {
            CustomerDTO customerDTO = new CustomerDTO(customer.getCustomerName(),
                    customer.getUserName(),
                    customer.getAddress(),
                    customer.getContact(),
                    customer.getEmail(),
                    customer.getSystemEmail(),
                    customer.getPassword());
            alCustomers.add(customerDTO);
        }
        return alCustomers;
    }

    @Override
    public CustomerDTO getCustomer(String userName) {
        Customer customer = customerRepository.findById(userName).get();
        CustomerDTO customerDTO = new CustomerDTO(customer.getUserName(),
                customer.getCustomerName(),
                customer.getAddress(),
                customer.getContact(),
                customer.getEmail(),
                customer.getSystemEmail(),
                customer.getPassword());
        return customerDTO;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean deleteCustomer(String customerName) {
        customerRepository.deleteById(customerName);
        return true;
    }

    @Override
    @Transactional(propagation = Propagation.REQUIRED)
    public boolean saveCustomer(CustomerDTO customer) {
        Customer customer1 = new Customer(customer.getUserName(),
                customer.getCustomerName(),
                customer.getAddress(),
                customer.getContact(),
                customer.getEmail(),
                customer.getSystemEmail(),
                customer.getPassword());
        customerRepository.save(customer1);
        return true;
    }

    @Override
    public int getAllCustomersCount() {
        return 0;
    }

    @Override
    public boolean canAuthenticate(String username, String password) {

        System.out.println("login customer service");

        boolean exists = customerRepository.existsById(username);

        if (!exists){
            return false;
        }

        Customer customer = customerRepository.findById(username).get();

        return customer.getPassword().equals(password);
    }
}
