package com.example.week7.Entity;

import com.example.week7.Enum.Status;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "vinhquang_customer")
@Data
@NoArgsConstructor
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;
    @Column(name = "name")
    private String name;
    @Column(name = "age")
    private int age;

    @Column(name = "email",unique = true)
    private String email;
    @Column(name = "phone")
    private String phone;

    @Enumerated(EnumType.STRING)
    @Column(name = "status")
    private Status status = Status.ACTIVE;
    @ManyToOne
    @JoinColumn(name = "customer_type_id", referencedColumnName = "id", nullable = true)
    private CustomerType customerType;



}
