package org.hibernate.config;

import org.hibernate.SessionFactory;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;
import org.hibernate.cfg.Configuration;

public class HibernateUtil {

	private static final SessionFactory sessionFactory = buildSessionFatory();

	private static SessionFactory buildSessionFatory() {

		try {

			Configuration configuration = new Configuration();
			configuration.configure("hibernate.cfg.xml");

			return configuration
					.buildSessionFactory(new StandardServiceRegistryBuilder().
							applySettings(configuration.getProperties()).build());
		
		} catch (Exception e) {
			
			e.printStackTrace();
			
			throw new RuntimeException("Error occure in the SessionFactory building");

		}
	}

	public static SessionFactory getSessionFactory() {

		return sessionFactory;
	}
}
