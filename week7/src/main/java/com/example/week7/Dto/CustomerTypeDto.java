package com.example.week7.Dto;

import com.example.week7.Entity.CustomerType;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@NoArgsConstructor
public class CustomerTypeDto {
    private String code;
    private String name;

    public CustomerTypeDto(CustomerType customerType){
        this.code = customerType.getCode();
        this.name = customerType.getName();
    }
}
