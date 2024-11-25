package com.example.week7.Controller;

import com.example.week7.Dto.CustomerTypeDto;
import com.example.week7.Response.ApiResponse;

import com.example.week7.Service.Impl.ICustomerTypeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/customerTypes")
public class CustomerTypeController {

    @Autowired
    private ICustomerTypeService customerTypeService;

    // get list CustomerTypes
    @GetMapping
    public ResponseEntity<ApiResponse<List<CustomerTypeDto>>> getAllCustomerTypes(@RequestParam Integer page ,
                                                                                  @RequestParam Integer pageSize,
                                                                                  @RequestParam String sort)  {
        List<CustomerTypeDto> customerTypes = customerTypeService.getAllCustomerTypes(page,pageSize,sort);
        ApiResponse<List<CustomerTypeDto>> response = ApiResponse.<List<CustomerTypeDto>>builder()
                .message("customer types successfully")
                .result(customerTypes)
                .status(HttpStatus.OK.value())  // Trả mã 200 (OK)
                .build();

        return ResponseEntity.ok(response);
    }

    // Tạo mới CustomerType
    @PostMapping
    public ResponseEntity<ApiResponse<Void>> createCustomerType(@RequestBody CustomerTypeDto customerTypeDto) {
        try {
            customerTypeService.insertCustomerType(customerTypeDto);
            ApiResponse<Void> response = ApiResponse.<Void>builder()
                    .message("Customer type created successfully")
                    .result(null)
                    .status(HttpStatus.CREATED.value())  // Trả mã 201 (Created)
                    .build();

            return ResponseEntity.status(HttpStatus.CREATED).body(response);
        } catch (RuntimeException ex) {
            ApiResponse<Void> errorResponse = ApiResponse.<Void>builder()
                    .message(ex.getMessage())
                    .result(null)
                    .status(HttpStatus.BAD_REQUEST.value())  // Trả mã 400 (Bad Request)
                    .build();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }

    // Cập nhật CustomerType
    @PutMapping("/{code}")
    public ResponseEntity<ApiResponse<Void>> updateCustomerType(@PathVariable String code, @RequestBody CustomerTypeDto customerTypeDto) {
        try {
            customerTypeService.updateCustomerType(code, customerTypeDto);
            ApiResponse<Void> response = ApiResponse.<Void>builder()
                    .message("Customer type updated successfully")
                    .status(HttpStatus.OK.value())  // Trả mã 200 (OK)
                    .build();

            return ResponseEntity.ok(response);
        } catch (RuntimeException ex) {
            ApiResponse<Void> errorResponse = ApiResponse.<Void>builder()
                    .message(ex.getMessage())
                    .status(HttpStatus.BAD_REQUEST.value())  // Trả mã 400 (Bad Request)
                    .build();
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).body(errorResponse);
        }
    }

    // Xóa CustomerType theo code
    @DeleteMapping("/{code}")
    public ResponseEntity<ApiResponse<Void>> deleteCustomerType(@PathVariable String code) {
        try {
            customerTypeService.deleteCustomerType(code);
            ApiResponse<Void> response = ApiResponse.<Void>builder()
                    .message("Customer type deleted successfully")
                    .status(HttpStatus.NO_CONTENT.value())  // Trả mã 204 (No Content)
                    .build();

            return ResponseEntity.status(HttpStatus.NO_CONTENT).body(response);
        } catch (RuntimeException ex) {
            ApiResponse<Void> errorResponse = ApiResponse.<Void>builder()
                    .message(ex.getMessage())
                    .status(HttpStatus.NOT_FOUND.value())  // Trả mã 404 (Not Found)
                    .build();
            return ResponseEntity.status(HttpStatus.NOT_FOUND).body(errorResponse);
        }
    }
}
