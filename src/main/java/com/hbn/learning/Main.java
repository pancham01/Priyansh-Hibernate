package com.hbn.learning;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee(2, "ansh", "male", 99000);

		Configuration cfg = new Configuration().configure("hibernate.cfgg.xml");// 1
		SessionFactory sessionFactory = cfg.buildSessionFactory();// 2
		Session session = sessionFactory.openSession();// 3
		Transaction transaction = session.beginTransaction();// 4

		session.persist(emp);
		transaction.commit();

	}

}
