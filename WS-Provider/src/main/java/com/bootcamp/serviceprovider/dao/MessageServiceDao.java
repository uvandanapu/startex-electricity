package com.bootcamp.serviceprovider.dao;

import org.hibernate.HibernateException;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

import com.bootcamp.serviceprovider.model.CustomerInfo;
import com.bootcamp.serviceprovider.utility.HibernateUtility;

public class MessageServiceDao {


	

	public void saveCustomerService(int id, int sid){
		
		Session session = HibernateUtility.getSessionFactory().openSession();
		
		Transaction tx = session.beginTransaction();
		
		try {
			
			Query query = session.createQuery("update CustomerInfo set sid = :sid" + " where id = :id");
			
			query.setParameter("sid", sid);
			query.setParameter("id", id);
			
			int row = query.executeUpdate();
			
			System.out.println(row);
			
			tx.commit();
			
		} catch (HibernateException e){
			
			e.printStackTrace();
			
			
		} finally {
			
			session.flush();
			session.close();
			
		}
		
		
	}
	
}

		
