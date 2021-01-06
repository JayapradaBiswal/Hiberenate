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
	Laptop lp=new Laptop();
	lp.setBrand("Hp");
	lp.setModel("i5");
	
	Student st=new Student();
	st.setName("Jppp");
	st.setBranch("ECE");
	
	//Relationship
	lp.setStudent(st);
	st.setLaptop(lp);
	Session session=factory.openSession();
	Transaction tr=session.beginTransaction();
	
	session.save(st);
	session.save(lp);
	
	tr.commit();
	session.close();
	factory.close();
	
}
}
