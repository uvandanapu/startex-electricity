package com.utilityservice.serviceplans.dao;


import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.utilityservice.serviceplans.model.Customer;

@Repository
public class CustomerDAO {

	
	@Autowired
	private SessionFactory sessionFactory;

	
	public int addCustomer(Customer customer) {
		
		Session session = this.sessionFactory.getCurrentSession();
		
	int id = (Integer) session.save(customer);
		
	
		
		
		return  id;
	}

}
