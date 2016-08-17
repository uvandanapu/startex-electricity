package com.bootcamp.serviceprovider.dao;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.bootcamp.serviceprovider.model.PlanInfo;
import com.bootcamp.serviceprovider.utility.HibernateUtility;

public class CustomerServiceProviderDAO {
	
	@SuppressWarnings("unchecked")
	public List<PlanInfo> getServiceById() {

		List<PlanInfo> services = new ArrayList<PlanInfo>();

		Session session = HibernateUtility.getSessionFactory().openSession();

		try {

			services = session.createQuery("FROM PlanInfo").list();

			/*
			 * System.out.println(servicePlans.getSid());
			 * System.out.println(servicePlans.getPlans());
			 */

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;

		} finally {
			session.close();

		}
		if (services.isEmpty()) {

			return null;

		} else {

			return services;

		}

	}

	
}
