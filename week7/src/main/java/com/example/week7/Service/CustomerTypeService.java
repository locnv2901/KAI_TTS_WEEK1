package com.example.week7.Service;

import com.example.week7.Dto.CustomerDto;
import com.example.week7.Dto.CustomerTypeDto;


import java.util.List;

public interface CustomerTypeService {
    List<CustomerTypeDto> getAllCustomerTypes(Integer page,Integer PageSize,String sort);
    void insertCustomerType(CustomerTypeDto customerTypeDto);
    void updateCustomerType(String code, CustomerTypeDto customerTypeDto);
    void deleteCustomerType(String code);
}

