package com.example.week7.Repository;

import com.example.week7.Entity.Customer;
import jakarta.persistence.LockModeType;
import org.springframework.data.jpa.repository.EntityGraph;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Lock;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer,Long> {
    boolean existsByEmail(String email);

    boolean existsByName(String name);

    Customer findCustomerByEmail(String email);

    Customer findCustomerByName(String name);

    @Query("SELECT c FROM Customer c WHERE c.email LIKE %:emailSuffix%")
    List<Customer> findCustomersByEmailSuffix(@Param("emailSuffix") String emailSuffix);


    @Query("SELECT COUNT(c) FROM Customer c WHERE c.customerType = :customerType")
    long countCustomersByCustomerType(@Param("customerType") String customerType);

    @Lock(LockModeType.PESSIMISTIC_WRITE)
    @Query("SELECT c FROM Customer c WHERE c.id = :id")
    Customer findCustomerForUpdate(@Param("id") Long id);

    @EntityGraph(attributePaths = {"customerType"})
    @Query("SELECT c FROM Customer c WHERE c.email = :email")
    Customer findByEmailWithCustomerType(@Param("email") String email);
}
