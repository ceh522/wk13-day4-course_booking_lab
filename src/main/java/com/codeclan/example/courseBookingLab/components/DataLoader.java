package com.codeclan.example.courseBookingLab.components;

import com.codeclan.example.courseBookingLab.Models.Booking;
import com.codeclan.example.courseBookingLab.Models.Course;
import com.codeclan.example.courseBookingLab.Models.Customer;
import com.codeclan.example.courseBookingLab.repositories.BookingRepository.BookingRepository;
import com.codeclan.example.courseBookingLab.repositories.CourseRepository.CourseRepository;
import com.codeclan.example.courseBookingLab.repositories.CustomerRepository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {

    @Autowired
    BookingRepository bookingRepository;

    @Autowired
    CourseRepository courseRepository;

    @Autowired
    CustomerRepository customerRepository;

    public DataLoader() {
    }

    public void run(ApplicationArguments args) {
        Customer customer1 = new Customer("Mary", "Largs", 45 );
        customerRepository.save(customer1);
        Customer customer2 = new Customer("Jim", "Perth", 31 );
        customerRepository.save(customer2);

        Course course1 = new Course("UX Design", "Largs", 4);
        courseRepository.save(course1);
        Course course2 = new Course("Crochet", "Wigan", 3 );
        courseRepository.save(course2);

        Booking booking1 = new Booking("18-03-20", course1, customer2);
        bookingRepository.save(booking1);
        Booking booking2 = new Booking("27-02-20", course2, customer1);
        bookingRepository.save(booking2);

        customer1.addBooking(booking2);
        customerRepository.save(customer1);
        customer2.addBooking(booking1);
        customerRepository.save(customer2);

        course1.addBooking(booking1);
        courseRepository.save(course1);
        course2.addBooking(booking2);
        courseRepository.save(course2);


    }
}
