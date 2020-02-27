package com.codeclan.example.courseBookingLab.repositories.CustomerRepository;

import com.codeclan.example.courseBookingLab.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CustomerRepository extends JpaRepository<Customer, Long>, CustomerRepositoryCustom {
    List<Customer> findCustomerOnCourseId (Long courseId);
    List<Customer> findCustomerOnTownAndCourseId (String town, Long courseId);
}
