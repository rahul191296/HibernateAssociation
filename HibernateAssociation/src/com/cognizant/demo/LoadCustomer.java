package com.cognizant.demo;

import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.AnnotationConfiguration;

import com.cognizant.entity.Customer;

public class LoadCustomer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		AnnotationConfiguration configuration=
				new AnnotationConfiguration();
		configuration.configure();
		SessionFactory sessionFactory=
				configuration.buildSessionFactory();
		Session session=sessionFactory.openSession();
		Query query=session.createQuery("from Customer");
		List<Customer> custList=query.list();
		for(Customer c:custList){
			System.out.println(c);
		}

	}

}
