/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package nangcao;

import java.time.*;

/**
 *
 * @author LT MSI
 */
public class Customer {
     String customer_id,cusomer_name,customer_type,address,email;
        LocalDateTime time_update;

    public Customer() {
    }

    public Customer(String customer_id, String cusomer_name, String customer_type, String address, String email, LocalDateTime time_update) {
        this.customer_id = customer_id;
        this.cusomer_name = cusomer_name;
        this.customer_type = customer_type;
        this.address = address;
        this.email = email;
        this.time_update = time_update;
    }

    public String getCustomer_id() {
        return customer_id;
    }

    public void setCustomer_id(String customer_id) {
        this.customer_id = customer_id;
    }

    public String getCusomer_name() {
        return cusomer_name;
    }

    public void setCusomer_name(String cusomer_name) {
        this.cusomer_name = cusomer_name;
    }

    public String getCustomer_type() {
        return customer_type;
    }

    public void setCustomer_type(String customer_type) {
        this.customer_type = customer_type;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDateTime getTime_update() {
        return time_update;
    }

    public void setTime_update(LocalDateTime time_update) {
        this.time_update = time_update;
    }

        
}
