package com.OneToOne.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update
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
		Student st=session.get(Student.class, new Integer(2));
		System.out.println(st);
		
		st.setName("pkk");
		session.update(st);
		tr.commit();
		
		session.close();
		sessionFactory.close();
	}

}
