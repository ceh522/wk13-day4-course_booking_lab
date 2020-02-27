package com.codeclan.example.courseBookingLab.repositories.CustomerRepository;

import com.codeclan.example.courseBookingLab.Models.Customer;
import org.hibernate.Criteria;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.criterion.Restrictions;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import java.util.List;

public class CustomerRepositoryImpl implements CustomerRepositoryCustom {

    @Autowired
    EntityManager entityManager;

    @Transactional
    public List<Customer> findCustomerOnCourseId (Long courseId){
        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);

            cr.createAlias("bookings", "booking");
            cr.add(Restrictions.eq("booking.course.id", courseId));

            result = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();

        } finally {
            session.close();
        }

        return result;
    }

    @Transactional
    public List<Customer> findCustomerOnTownAndCourseId (String town, Long courseId){
        List<Customer> result = null;
        Session session = entityManager.unwrap(Session.class);

        try {
            Criteria cr = session.createCriteria(Customer.class);

            cr.createAlias("bookings", "booking");
            cr.add(Restrictions.eq("town", town));
            cr.add(Restrictions.eq("booking.course.id", courseId));

            result = cr.list();
        } catch (HibernateException ex){
            ex.printStackTrace();

        } finally {
            session.close();
        }

        return result;
    }

}
