package com.bootcamp.serviceprovider.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;

import com.bootcamp.serviceprovider.model.CustomerInfo;
import com.bootcamp.serviceprovider.utility.HibernateUtility;

/**
 * 
 * @author Boot Camp User 003
 *
 */
public class RestfulCustomerServiceDAO {

	public CustomerInfo getCustomerDetails(int id) {

		CustomerInfo customerInfo = new CustomerInfo();

		Session session = HibernateUtility.getSessionFactory().openSession();

		try {

			Query query = session.createQuery("FROM CustomerInfo where id = :id");

			query.setParameter("id", id);

			customerInfo = (CustomerInfo) query.uniqueResult();

		} catch (HibernateException e) {

			e.printStackTrace();

			return null;
			
		} finally {
			session.close();
		}
		return customerInfo;

	}

}
