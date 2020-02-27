package com.codeclan.example.courseBookingLab.controllers;

import com.codeclan.example.courseBookingLab.Models.Customer;
import com.codeclan.example.courseBookingLab.repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value="/customers")
public class CustomerController {

    @Autowired
    CustomerRepository customerRepository;

    @GetMapping(value="/search/findCustomerOnCourseId")
    public List<Customer> findCustomerOnCourseId(@RequestParam Long id){
        return customerRepository.findCustomerOnCourseId(id);
    }
}
