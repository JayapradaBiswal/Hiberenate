package com.OneToOne.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete 
{
	public static void main(String[] args) 
	{
		Configuration cfg=new Configuration();
		cfg.configure();
		System.out.println("Configuration done");
		
		SessionFactory sessionFactory=cfg.buildSessionFactory();
		System.out.println("Factory done");
		
		Session session=sessionFactory.openSession();
		
		Transaction tr=session.beginTransaction();
		Laptop l=session.get(Laptop.class, new Integer(1));		
		session.delete(l);
		
		tr.commit();
		session.close();
		sessionFactory.close();
	}
}
