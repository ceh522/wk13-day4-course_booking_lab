package com.codeclan.example.courseBookingLab.repositories.BookingRepository;

import com.codeclan.example.courseBookingLab.Models.Booking;
import com.codeclan.example.courseBookingLab.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {
    List<Booking> findByDate (String date);
}
