package com.OneToOne.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		System.out.println("Configuration done");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		System.out.println("Factory done");
		
		Session session=sessionFactory.openSession();
		
		Laptop l=session.get(Laptop.class, new Integer(1));
		System.out.println(l);
		
		session.close();
		sessionFactory.close();
	}
}
