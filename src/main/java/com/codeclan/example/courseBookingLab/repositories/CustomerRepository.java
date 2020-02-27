package com.codeclan.example.courseBookingLab.repositories;

import com.codeclan.example.courseBookingLab.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long> {
}
