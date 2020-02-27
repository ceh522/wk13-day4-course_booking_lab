package com.codeclan.example.courseBookingLab.repositories.CourseRepository;

import com.codeclan.example.courseBookingLab.Models.Course;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface CourseRepository extends JpaRepository<Course, Long>, CourseRepositoryCustom {
    List<Course> findByStarRating(int starRating);
    List<Course> findCourseUsingCustomerID(Long custId);
}
