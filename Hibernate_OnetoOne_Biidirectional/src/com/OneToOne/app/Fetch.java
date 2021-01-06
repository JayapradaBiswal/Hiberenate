package com.OneToOne.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import singleton.HibernateUtil;

public class Fetch
{
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory=HibernateUtil.buildSessionFactory();
		System.out.println("Factory done");
		
		Session session=sessionFactory.openSession();
		
		//Student student=session.get(Student.class, new Integer(1));
		//System.out.println(student);
		
		Laptop l=session.get(Laptop.class, new Integer(1));
		System.out.println(l);
		
		session.close();
		sessionFactory.close();
	}
}
