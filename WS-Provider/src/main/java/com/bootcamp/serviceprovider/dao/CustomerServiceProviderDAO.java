package com.bootcamp.serviceprovider.dao;

import java.util.ArrayList;
import java.util.List;

import org.apache.log4j.Logger;
import org.hibernate.HibernateException;
import org.hibernate.Session;

import com.bootcamp.serviceprovider.model.PlanInfo;
import com.bootcamp.serviceprovider.utility.HibernateUtility;

public class CustomerServiceProviderDAO {

	private static final Logger logger = Logger.getLogger(CustomerServiceProviderDAO.class);

	@SuppressWarnings("unchecked")
	public List<PlanInfo> getServiceById() {

		List<PlanInfo> services = new ArrayList<PlanInfo>();

		Session session = HibernateUtility.getSession();

		try {

			services = session.createQuery("FROM PlanInfo").list();

			logger.info("Getting Plans : " + services);

		} catch (HibernateException e) {
			e.printStackTrace();
			return null;

		} finally {
			HibernateUtility.closeSession();

		}
		if (services.isEmpty()) {

			return null;

		} else {

			return services;

		}

	}

}
