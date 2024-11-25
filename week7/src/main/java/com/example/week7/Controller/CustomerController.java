package com.example.week7.Controller;

import com.example.week7.Dto.CustomerDto;
import com.example.week7.Enum.Status;
import com.example.week7.Exception.NotFoundException;
import com.example.week7.Repository.CustomerTypeRepository;
import com.example.week7.Response.ApiResponse;

import com.example.week7.Service.Impl.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cache.annotation.Cacheable;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping("/api/customers")
public class CustomerController {

    @Autowired
    private ICustomerService customerService;
    @Autowired
    private CustomerTypeRepository customerTypeRepository;

    private <T> ResponseEntity<ApiResponse<T>> createResponse(HttpStatus status, String message, T result) {
        ApiResponse<T> response = ApiResponse.<T>builder()
                .message(message)
                .result(result)
                .status(status.value())
                .build();
        return ResponseEntity.status(status).body(response);
    }

    // get all Customers
    @GetMapping
    public ResponseEntity<ApiResponse<List<CustomerDto>>> getAllCustomers() {
        List<CustomerDto> customers = customerService.getCustomer();

        return createResponse(HttpStatus.OK, "Customer list successfully retrieved", customers);
    }

    // create Customer
    @PostMapping
    public ResponseEntity<ApiResponse<Long>> createCustomer(@RequestBody CustomerDto customerDto) {
        try {
            customerService.createCustomer(customerDto);

            return createResponse(HttpStatus.CREATED, "Customer created successfully", null);
        } catch (RuntimeException ex) {
            return createResponse(HttpStatus.BAD_REQUEST, ex.getMessage(), null);
        }
    }

    // update Customer
    @PutMapping("/{customerId}")
    public ResponseEntity<ApiResponse<Void>> updateCustomer(@PathVariable("customerId") Long customerId, @RequestBody CustomerDto customerDto) {
        try {
            customerService.updateCustomer(customerId, customerDto);
            return createResponse(HttpStatus.OK, "Customer updated successfully", null);
        } catch (RuntimeException ex) {
            return createResponse(HttpStatus.BAD_REQUEST, ex.getMessage(), null);
        }
    }

    // delete customer by Id
    @DeleteMapping("/{customerId}")
    public ResponseEntity<ApiResponse<Void>> deleteCustomer(@PathVariable("customerId") Long customerId) {
        try {
            customerService.delete(customerId);
            // Change to OK if you want to return a message, or remove the body for NO_CONTENT
            return createResponse(HttpStatus.OK, "Customer deleted successfully", null);
        } catch (RuntimeException ex) {
            return createResponse(HttpStatus.NOT_FOUND, ex.getMessage(), null);
        }
    }

    // update Customer Status
    @PutMapping("/{customerId}/status")
    public ResponseEntity<ApiResponse<Void>> updateCustomerStatus(@PathVariable("customerId") Long customerId, @RequestBody Status status) {
        try {
            customerService.updateCustomerStatus(customerId, status);
            return createResponse(HttpStatus.OK, "Customer status updated successfully", null);
        } catch (RuntimeException e) {
            return createResponse(HttpStatus.BAD_REQUEST, e.getMessage(), null);
        }
    }

    // get customer by email
    @GetMapping("/by-email")
    public ResponseEntity<ApiResponse<CustomerDto>> getCustomerByEmailWithCustomerType(@RequestParam String email) {
        try {
            CustomerDto customerDto = customerService.getCustomerByEmailWithCustomerType(email);
            return createResponse(HttpStatus.OK, "Customer fetched successfully", customerDto);
        } catch (RuntimeException e) {
            return createResponse(HttpStatus.NOT_FOUND, e.getMessage(), null);
        }
    }


    // get customer By Name
    @GetMapping("/by-name")
    public  ResponseEntity<ApiResponse<CustomerDto>> getCustomerByName(@RequestParam String name){
        try {
            CustomerDto customerDto = customerService.getCustomerByName(name);
            return createResponse(HttpStatus.OK,"Customer fetched successfully",customerDto);
        } catch (NotFoundException e) {
            return createResponse(HttpStatus.NOT_FOUND, e.getMessage(), null);
        }
    }


    @GetMapping("/by-emailSuffix")
    public ResponseEntity<ApiResponse<List<CustomerDto>>> getCustomersByEmailSuffix(@RequestParam String emailSuffix){
        List<CustomerDto> customers= customerService.getCustomerByEmailSuffix(emailSuffix);

        return createResponse(HttpStatus.OK,"List fetched successfully", customers);
    }

}
