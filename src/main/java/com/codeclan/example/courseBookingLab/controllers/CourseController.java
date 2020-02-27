package com.codeclan.example.courseBookingLab.controllers;

import com.codeclan.example.courseBookingLab.Models.Course;
import com.codeclan.example.courseBookingLab.repositories.CourseRepository.CourseRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping(value = "/courses")
public class CourseController {

    @Autowired
    CourseRepository courseRepository;

    @GetMapping(value = "/search/findCourseUsingCustomerID")
    public List<Course> findCourseUsingCustomerID(@RequestParam Long custId){
      return courseRepository.findCourseUsingCustomerID(custId);
    }
}
