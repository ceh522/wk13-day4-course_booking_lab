package com.codeclan.example.courseBookingLab.repositories.CustomerRepository;

import com.codeclan.example.courseBookingLab.Models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findCustomerOnCourseId (Long courseId);
    List<Customer> findCustomerOnTownAndCourseId (String town, Long courseId);
    List<Customer> findCustomerOverAgeInTownUsingCourseId (int age, String town, Long courseId);
}
