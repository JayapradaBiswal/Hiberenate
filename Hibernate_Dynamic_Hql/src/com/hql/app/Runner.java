package com.hql.app;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;


import singleton.HibernateUtil;

public class Runner
{
	public static void main(String[] args)
	{
		//build factory
		SessionFactory factory=HibernateUtil.buildSessionFactory();
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		Student kj=new Student();
		kj.setName("Kshitij Joshi");
		kj.setPercentage(67.1f);
		kj.setAge(18);
		kj.setStream("ECE");
		
		Student ashok=new Student();
		ashok.setName("Ashok Sarma");
		ashok.setPercentage(87.2f);
		ashok.setAge(24);
		ashok.setStream("ECE");
		
		Student suraj=new Student();
		suraj.setName("Suraj Sharma");
		suraj.setPercentage(94.8f);
		suraj.setAge(21);
		suraj.setStream("CSE");
		
		Student arti=new Student();
		arti.setName("Atrti Sethy");
		arti.setPercentage(95.4f);
		arti.setAge(21);
		arti.setStream("ME");
		
		Student jp=new Student();
		jp.setName("Jp Biswal");
		jp.setPercentage(76.1f);
		jp.setAge(23);
		jp.setStream("ME");
		
		session.save(jp);
		session.save(arti);
		session.save(suraj);
		session.save(ashok);
		session.save(kj);
		
		tr.commit();
		session.close();
		factory.close();
		
		
}
}