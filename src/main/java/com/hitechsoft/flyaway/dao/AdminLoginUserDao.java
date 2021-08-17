package com.hitechsoft.flyaway.dao;

import java.util.List;

import org.hibernate.HibernateException;
import org.hibernate.SQLQuery;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import com.hitechsoft.flyaway.common.DatabaseConnection;
import com.hitechsoft.flyaway.entity.admin_login;

public class AdminLoginUserDao {
	
	public boolean validate(String username, String password) {
		Transaction transaction = null;
		admin_login user=null;
		try (Session session = DatabaseConnection.getSessionFactory().openSession()) {
			
			System.out.println(session.isConnected()+"+++++++++++++++++++++++");
			
			
            transaction = session.beginTransaction();
            user = (admin_login) session.createQuery("FROM admin_login",admin_login.class).uniqueResult();
            if (user != null &&
			  user.getPassword().equals(password)) { return true; }
		       transaction.commit();
            session.close();
        } catch (HibernateException e) {
            if (transaction != null) {
                transaction.rollback();
            }
            e.printStackTrace();
        }
		return false;
		
	}
}
