package com.day2.HibernatePersist;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;
import com.entity.Students;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
    	
    //loading the configuration
    	Configuration cg=new Configuration();
    	cg.configure("hibernate.cfg.xml");
    	
    	//Create Session-Factory
    	SessionFactory sf=cg.buildSessionFactory();
    	
    	//Open Session-Factory
    	Session s=sf.openSession();    	
    	
    	//Begin-Transaction
    	Transaction t=s.beginTransaction();
    	
    	Students st=new Students(1,"Ayush",21,88,"ayush@gmail.com","1234567890");
    	
    	//Perform Operation
    	s.persist(st);
    	t.commit();
    	
    	s.close();
    	sf.close();
    	
    }
}
