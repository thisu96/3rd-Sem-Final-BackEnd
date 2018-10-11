package lk.ijse.spring.rest.maven.entity;

import javax.persistence.*;

@Entity
public class Customer {
    @Id
    //@Column(name = "userName", unique = true, nullable = false)
    private String userName;
    private String customerName;
    private String address;
    private String contact;
    private String email;
    private String systemEmail;
    private String password;

    public Customer() {
    }

    public Customer(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public Customer(String userName, String customerName, String address, String contact, String email, String systemEmail, String password) {
        this.userName = userName;
        this.customerName = customerName;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.systemEmail = systemEmail;
        this.password = password;
    }

    public String getSystemEmail() {
        return systemEmail;
    }

    public void setSystemEmail(String systemEmail) {
        this.systemEmail = systemEmail;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getContact() {
        return contact;
    }

    public void setContact(String contact) {
        this.contact = contact;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "userName='" + userName + '\'' +
                ", customerName='" + customerName + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", systemEmail='" + systemEmail + '\'' +
                ", password='" + password + '\'' +
                '}';
    }
}

