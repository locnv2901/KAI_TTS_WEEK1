package com.example.week7.Service;

import com.example.week7.Dto.CustomerDto;
import com.example.week7.Entity.Customer;
import com.example.week7.Enum.Status;
import com.example.week7.Exception.NotFoundException;


import java.util.List;

public interface CustomerService {
    List<CustomerDto> getCustomer();
    void createCustomer(CustomerDto customerDto);
    void updateCustomer(Long customer_id,CustomerDto customerDto);
    void delete(Long Customer_id);
    void updateCustomerStatus(Long id, Status status);
    CustomerDto getCustomerByEmailWithCustomerType(String email);
    CustomerDto getCustomerByEmail(String email) throws NotFoundException;
    CustomerDto getCustomerByName(String name) throws NotFoundException;
    List<CustomerDto> getCustomerByEmailSuffix(String emailSuffix);
    long getCountCustomerByCustomerType(String customerType);

}
