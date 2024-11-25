package com.example.week7.Entity;

import com.example.week7.Enum.Status;
import jakarta.persistence.*;
import lombok.*;

import java.util.ArrayList;
import java.util.List;


@Entity
@Table(name = "vinhquang_customer_type")
@Data
@NoArgsConstructor
public class CustomerType {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(name = "code")
    private String code;
    @Column(name = "name")
    private String name;
    @OneToMany(mappedBy = "customerType",fetch = FetchType.LAZY)
    private List<Customer> customers = new ArrayList<>();
}
