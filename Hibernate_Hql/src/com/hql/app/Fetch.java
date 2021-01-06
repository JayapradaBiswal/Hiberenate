package com.hql.app;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;

import singleton.HibernateUtil;

public class Fetch
{
	public static void main(String[] args) 
	{
		SessionFactory sessionFactory=HibernateUtil.buildSessionFactory();
		
		Session session=sessionFactory.openSession();
		//we need Query object to execute HQl
//Query<Student> query=session.createQuery("from Student where name='Kshitij Joshi'");
		
		Query<Student> query=session.createQuery("select s from Student s where name='Kshitij Joshi'");
//Student student=query.uniqueResult();
//System.out.println(student);
		List<Student> list=query.list();
		//list.forEach(System.out::println);//LAMDA EXPRESSION
		for(Student s:list)
		{
			System.out.println(s);
		}
	}
}