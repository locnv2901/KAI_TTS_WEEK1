package com.example.week7.Service.Impl;

import com.example.week7.Dto.CustomerTypeDto;
import com.example.week7.Entity.CustomerType;
import com.example.week7.Repository.CustomerTypeRepository;
import com.example.week7.Service.CustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ICustomerTypeService implements CustomerTypeService {

    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Override
    public List<CustomerTypeDto> getAllCustomerTypes(Integer page,Integer pageSize,String sort) {
        Sort sorted = sort.equalsIgnoreCase("DESC") ? Sort.by("name").descending() : Sort.by("name").ascending();
        List<CustomerTypeDto> customerTypeDtos = new ArrayList<>();
        if(page == null){
            page = 0;
        }

        Page<CustomerType> pages = customerTypeRepository.findAll(PageRequest.of(page ,pageSize,sorted));

        if(page != null){
            pages.forEach(x -> customerTypeDtos.add(new CustomerTypeDto(x)));
        }


        return customerTypeDtos;
    }

    @Override
    public void insertCustomerType(CustomerTypeDto customerTypeDto) {
        // Tạo CustomerType mới từ customerTypeDto và lưu vào database
        CustomerType customerType = new CustomerType();
        customerType.setCode(customerTypeDto.getCode());
        customerType.setName(customerTypeDto.getName());
        customerTypeRepository.save(customerType);
    }

    @Override
    public void updateCustomerType(String code, CustomerTypeDto customerTypeDto) {
        CustomerType customerType = customerTypeRepository.findByCode(code)
                .orElseThrow(() -> new RuntimeException("Customer type with code " + code + " not found"));
        customerType.setName(customerTypeDto.getName());
        customerTypeRepository.save(customerType);
    }

    @Override
    public void deleteCustomerType(String code) {
        CustomerType customerType = customerTypeRepository.findByCode(code)
                .orElseThrow(() -> new RuntimeException("Customer type with code " + code + " not found"));
        customerTypeRepository.delete(customerType);
    }
}
