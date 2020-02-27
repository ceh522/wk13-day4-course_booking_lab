package com.codeclan.example.courseBookingLab.repositories;

import com.codeclan.example.courseBookingLab.Models.Customer;

import java.util.List;

public interface CustomerRepositoryCustom {
    List<Customer> findCustomerOnCourseId (Long courseId);
}
