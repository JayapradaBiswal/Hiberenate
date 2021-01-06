package com.OneToMany.App;
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
		
		Father f=session.get(Father.class,new Long(1));
		System.out.println(f);
		//System.out.println(f.getListOfChids());
		
		session.close();
		sessionFactory.close();
	}
}
