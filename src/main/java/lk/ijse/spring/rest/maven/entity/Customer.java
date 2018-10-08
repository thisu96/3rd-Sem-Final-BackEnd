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
    private String password;
    private String confirmPassword;

    public Customer() {
    }

    public Customer(String userName, String password){
        this.userName = userName;
        this.password = password;
    }

    public Customer(String customerName, String userName, String address, String contact, String email, String password, String confirmPassword) {
        this.customerName = customerName;
        this.userName = userName;
        this.address = address;
        this.contact = contact;
        this.email = email;
        this.password = password;
        this.confirmPassword = confirmPassword;
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

    public String getConfirmPassword() {
        return confirmPassword;
    }

    public void setConfirmPassword(String confirmPassword) {
        this.confirmPassword = confirmPassword;
    }

    @Override
    public String toString() {
        return "Customer{" +
                ", customerName='" + customerName + '\'' +
                ", userName='" + userName + '\'' +
                ", address='" + address + '\'' +
                ", contact='" + contact + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", confirmPassword='" + confirmPassword + '\'' +
                '}';
    }
}