package com.hbn.learning;

import org.hibernate.SessionFactory;
import org.hibernate.boot.Metadata;
import org.hibernate.boot.MetadataSources;
import org.hibernate.boot.registry.StandardServiceRegistry;
import org.hibernate.boot.registry.StandardServiceRegistryBuilder;

public class HibernateConfig {
	
	
	public static SessionFactory getSessionFactory()
	{
		
		StandardServiceRegistry ssr = new StandardServiceRegistryBuilder().configure("hibernate.cfgg.xml").build();
		
		Metadata meta = new MetadataSources(ssr).getMetadataBuilder().build();
		
		return meta.buildSessionFactory();
		
	}

}
