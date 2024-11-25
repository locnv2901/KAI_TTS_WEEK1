package com.example.week7.Service.Impl;

import com.example.week7.Dto.CustomerDto;
import com.example.week7.Entity.Customer;
import com.example.week7.Entity.CustomerType;
import com.example.week7.Enum.Status;
import com.example.week7.Exception.NotFoundException;
import com.example.week7.Repository.CustomerRepository;

import com.example.week7.Repository.CustomerTypeRepository;
import com.example.week7.Service.CustomerService;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.CacheEvict;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.listener.ChannelTopic;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ICustomerService implements CustomerService {
    @Autowired
    private RedisTemplate<String,Object> redisTemplate;

    @Autowired
    private ChannelTopic topic;
    @Autowired
    private CustomerRepository customerRepository;

    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    @Override
    @Cacheable(value = "customers", key = "'all_customers'")
    public List<CustomerDto> getCustomer() {

        List<Customer> listCustomer  = customerRepository.findAll();
        List<CustomerDto> res = new ArrayList<>();
        listCustomer.forEach(x  -> res.add(new CustomerDto(x)));

        return res;
    }

    @Override
    @CacheEvict(value = "customers", key = "'all_customers'", allEntries = true)
    public void createCustomer(CustomerDto customerDto) {

        boolean existEmail = customerRepository.existsByEmail(customerDto.getEmail());
        if(existEmail){
            throw new RuntimeException("email already exist");
        }
        Customer customer = new Customer();

        if (customerDto.getCustomerTypeId() != null ) {

            CustomerType customerType = customerTypeRepository.findById(customerDto.getCustomerTypeId())
                    .orElseThrow(() -> new RuntimeException("CustomerType not found with ID: " + customerDto.getCustomerTypeId()));
            customer.setCustomerType(customerType);
        }

        customer.setName(customerDto.getName());
        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setPhone(customerDto.getPhone());



        customerRepository.save(customer);
    }

    @Override
    @CacheEvict(value = "customers", key = "'all_customers'", allEntries = true)
    public void updateCustomer(Long customer_id, CustomerDto customerDto) {
        Customer customer = customerRepository.findById(customer_id).orElseThrow(() -> new RuntimeException("Customer Id not exist"));
        boolean emailExists = customerRepository.existsByEmail(customerDto.getEmail());


        if (emailExists && !customer.getEmail().equals(customerDto.getEmail())) {
            throw new RuntimeException("Email already exists for another customer");
        }


        customer.setName(customerDto.getName());
        customer.setEmail(customerDto.getEmail());
        customer.setPhone(customerDto.getPhone());
        if (customerDto.getCustomerTypeId() != null) {
            CustomerType customerType = new CustomerType();
            customerType.setId(customerDto.getCustomerTypeId());
            customer.setCustomerType(customerType);
        }
        customerRepository.save(customer);
    }

    @Override
    @CacheEvict(value = "customers", key = "'all_customers'", allEntries = true)
    public void delete(Long customer_id) {
        if (!customerRepository.existsById(customer_id)) {
            throw new RuntimeException("Customer with id " + customer_id + " does not exist");
        }
        customerRepository.deleteById(customer_id);

        redisTemplate.convertAndSend(topic.getTopic(),"Customer with ID " + customer_id + " was deleted ");
    }
    @Override
    @CacheEvict(value = "customers", key = "'all_customers'", allEntries = true)
    @Transactional
    public void updateCustomerStatus(Long id, Status status) {
        Customer customer = customerRepository.findCustomerForUpdate(id);
        if (customer != null) {
            customer.setStatus(status);
            customerRepository.save(customer);
        }
    }
    @Override
    @Cacheable(value = "customer", key = "#email")
    public CustomerDto getCustomerByEmailWithCustomerType(String email) {
        Customer customer =  customerRepository.findByEmailWithCustomerType(email);
        CustomerDto customerDto = new CustomerDto(customer);
        return customerDto;
    }

    @Override
    @Cacheable(value = "customer", key = "#email")
    public CustomerDto getCustomerByEmail(String email) throws NotFoundException {


        boolean emailExists = customerRepository.existsByEmail(email);
        if (!emailExists) {
            throw new NotFoundException("Email not exists ");
        }
        var customer  = customerRepository.findCustomerByEmail(email);



        CustomerDto customerDto = new CustomerDto(customer);
        return customerDto;
    }

    @Override
    @Cacheable(value = "customer", key = "#name")
    public CustomerDto getCustomerByName(String name) throws NotFoundException {
        if(!customerRepository.existsByName(name)){
            throw new NotFoundException("Name not existed ");
        }
        var customer  = customerRepository.findCustomerByName(name);
        CustomerDto customerDto = new CustomerDto(customer);
        return customerDto;
    }

    @Override
    @Cacheable(value = "customersByEmailSuffix", key = "#emailSuffix")
    public List<CustomerDto> getCustomerByEmailSuffix(String emailSuffix) {
        List<Customer> customers = customerRepository.findCustomersByEmailSuffix(emailSuffix);
        List<CustomerDto> customerDtos = new ArrayList<>();
        customers.forEach(x -> customerDtos.add(new CustomerDto(x)));
        return customerDtos;
    }
    @Override
    public long getCountCustomerByCustomerType(String customerType) {

        long countCustomer = customerRepository.countCustomersByCustomerType(customerType);
        return countCustomer;
    }


}
