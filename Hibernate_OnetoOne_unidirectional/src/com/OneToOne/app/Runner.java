package com.OneToOne.app;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import singleton.HibernateUtil;
public class Runner 
{
public static void main(String[] args) 
{
	SessionFactory factory=HibernateUtil.buildSessionFactory();
	Session session=factory.openSession();
	Transaction tr=session.beginTransaction();
	
	Student student=new Student();
	student.setName("Jppp");
	student.setBranch("ECE");
	
	Laptop lp=new Laptop();
	lp.setBrand("Hp");
	lp.setModel("i5");
	lp.setStudent(student);
	
	session.save(student);
	session.save(lp);
	
	tr.commit();
	session.close();
	factory.close();
	
}
}
