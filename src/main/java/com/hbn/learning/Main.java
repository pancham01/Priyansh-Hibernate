package com.hbn.learning;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.hbn.learning.entity.Address;
import com.hbn.learning.entity.Employee;

public class Main {

	public static void main(String[] args) {
		Address add1 = new Address("Noida", "UP", 201301);
		Address add2 = new Address("GZB", "UP", 301301);
		Address add3 = new Address("Gurgaon", "HR", 601301);
		Address add4 = new Address("Mumbai", "MH", 801301);
		
		List<Address> listOfAdd = new ArrayList<>();
		listOfAdd.add(add1);
		listOfAdd.add(add2);
		listOfAdd.add(add3);
		listOfAdd.add(add4);
		

		Employee emp = new Employee();
		emp.setName("Anoop");
		emp.setGender("male");
		emp.setSalary(77700);
		emp.setAddress(listOfAdd);
		
		
		add1.setEmployee(emp);
		add2.setEmployee(emp);
		add3.setEmployee(emp);
		add4.setEmployee(emp);

		Session session = HibernateConfig.getSessionFactory().openSession();
		Transaction transaction = session.beginTransaction();

		session.persist(emp);
		transaction.commit();

		Employee employee = session.find(Employee.class, 1);
		System.out.println(employee);
		System.out.println(employee.getAddress());
		
		Address address = session.find(Address.class, 3);
		System.out.println(address);
		System.out.println(address.getEmployee());


	}

}
