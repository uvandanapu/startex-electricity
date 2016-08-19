package com.bootcamp.serviceprovider.utility;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

@SuppressWarnings("deprecation")
public class HibernateUtility {

	private static final SessionFactory sessionFactory;
	private static Session session;

	static {
		try {
			sessionFactory = new Configuration().configure().buildSessionFactory();

		} catch (Throwable exception) {

			System.err.println("Initial SessionFactory creation failed." + exception);

			throw new ExceptionInInitializerError(exception);
		}
	}

	public static Session getSession() {

		if (session == null) {

			session = sessionFactory.openSession();
		}
		return session;
	}

	public static Session closeSession() {

		if (session != null) {
			session.close();
			session = null;
		}

		return session;
	}

}