package com.hitechsoft.flyaway.common;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DatabaseConnection {
	
	private static SessionFactory sessionFactory;

	public static SessionFactory getSessionFactory() {
		if (sessionFactory == null) {
		Configuration cfg = new Configuration();
		
		Properties prop = new Properties();

		//load properties file
	
		try {
			prop.load(Thread.currentThread().getContextClassLoader().getResourceAsStream("hibernate.properties"));
			cfg.setProperties(prop);
			cfg.addAnnotatedClass(com.hitechsoft.flyaway.entity.admin_login.class);
			SessionFactory sessionFactory = cfg.buildSessionFactory();
			return sessionFactory;
			
		} 
		catch (HibernateException e) {
		e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		}
		return sessionFactory;
	}
}
