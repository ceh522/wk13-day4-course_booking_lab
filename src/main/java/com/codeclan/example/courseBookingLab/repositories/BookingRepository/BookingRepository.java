package com.codeclan.example.courseBookingLab.repositories.BookingRepository;

import com.codeclan.example.courseBookingLab.Models.Booking;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookingRepository extends JpaRepository<Booking, Long> {

}
