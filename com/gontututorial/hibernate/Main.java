package com.gontututorial.hibernate;


import org.hibernate.cfg.Configuration;

import org.hibernate.Session;
import org.hibernate.SessionFactory;

//import com.fasterxml.classmate.AnnotationConfiguration;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Student_Info student = new Student_Info();
		
		student.setName("Raghav");
		student.setRollNo(2);
		
		Configuration config = new Configuration();
		SessionFactory sessionFactory = config.configure("hibernate.cfg.xml").buildSessionFactory();

		Session session = sessionFactory.openSession();
		session.beginTransaction();
		
		session.save(student);
		
		session.getTransaction().commit();
		session.close();
		sessionFactory.close();
	}
}
