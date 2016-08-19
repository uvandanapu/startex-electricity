package com.utilityservice.serviceplans.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.utilityservice.serviceplans.model.Customer;

@Repository
public class CustomerDAO {

	private static final Logger logger = LoggerFactory.getLogger(CustomerDAO.class);

	@Autowired
	private SessionFactory sessionFactory;

	
	public int addCustomer(Customer customer) {
		
		Session session = this.sessionFactory.getCurrentSession();
		
	int id = (Integer) session.save(customer);
		
		logger.info("Person saved successfully, Person Details=" + customer);
		
		
		return  id;
	}

}
