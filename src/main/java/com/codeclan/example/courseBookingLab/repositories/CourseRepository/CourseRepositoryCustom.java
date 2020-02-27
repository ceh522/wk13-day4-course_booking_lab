package com.codeclan.example.courseBookingLab.repositories.CourseRepository;

import com.codeclan.example.courseBookingLab.Models.Course;

import java.util.List;

public interface CourseRepositoryCustom {
    List<Course> findCourseUsingCustomerID(Long custId);
}
