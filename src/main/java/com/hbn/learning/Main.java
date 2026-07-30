package com.hbn.learning;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.MutationQuery;
import org.hibernate.query.Query;

import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {

		Employee emp = new Employee("Avinash Jain", "male", 99000);

		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

//		Query query = session.createQuery("from emppp",Employee.class);
//		List list = query.list();
//		System.out.println(list);

//		Query query = session.createQuery("from emppp",Employee.class);
//		query.setFirstResult(2);
//		query.setMaxResults(4);
//		List list = query.list();
//		System.out.println(list);

//		MutationQuery query = session.createMutationQuery("update emppp set name =:n , salary =:s where id =:i");
//		query.setParameter("n", "Vinod");
//		query.setParameter("s", 454353);
//		query.setParameter("i", 4);
//		query.executeUpdate();
//		transaction.commit();
		
		
//		MutationQuery query = session.createMutationQuery("delete from emppp where id =:i");
//		query.setParameter("i", 7);
//		query.executeUpdate();
//		transaction.commit();


		Query query1 = session.createQuery("SELECT max(name) from emppp");
		System.out.println(query1.list());

	}

}
