package com.example.week7.Dto;

import com.example.week7.Entity.Customer;
import com.example.week7.Entity.CustomerType;
import com.example.week7.Enum.Status;
import lombok.*;

import java.io.Serializable;

@Data
@NoArgsConstructor
public class CustomerDto implements Serializable {

    private String name;
    private int age;
    private String email;
    private String phone;
    private String status;
    private Long customerTypeId;
    public CustomerDto(Customer customer){
        this.name = customer.getName();
        this.age = customer.getAge();
        this.email = customer.getEmail();
        this.phone = customer.getPhone();
        this.status  =  String.valueOf(customer.getStatus());
        this.customerTypeId = customer.getCustomerType().getId();

    }
}
