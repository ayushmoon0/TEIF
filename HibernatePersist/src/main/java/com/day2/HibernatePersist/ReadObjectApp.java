package com.day2.HibernatePersist;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.entity.Students;

public class ReadObjectApp {
	public static void main(String[] args) {
		
		//Configure the Hibernate
		Configuration cf =new Configuration();
		cf.configure("hibernate.cfg.xml");
		
		//Build Session Factory
		SessionFactory sf=cf.buildSessionFactory();
		
		//Open Session
		Session s=sf.openSession();
		
		Transaction t=s.beginTransaction();
		
		Students s1=s.get(Students.class, 1);
		
		if(s1!=null) {
			System.out.println(s1);
			
		}
		else {
			System.out.println("No data found");
		}
		
		t.commit();
		s.close();
		sf.close();
	}
}
