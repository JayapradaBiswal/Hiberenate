package com.OneToMany.App;

import java.util.*;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;

import singleton.HibernateUtil;

public class Runner
{
	public static void main(String[] args)
	{
		SessionFactory factory=HibernateUtil.buildSessionFactory();
		Father rp=new Father();
		rp.setName("Ram Prasad");
		
		Children chandini=new Children();
		chandini.setName("Chandini");
		chandini.setGender('F');
		
		Children sb=new Children();
		sb.setName("Sham Bihari");
		sb.setGender('M');
		//father accept list of child so create list for childrens
		//List<Children> list=new ArrayList<Children>();
		//list.add(chandini);
		//list.add(sb);
		
		List<Children> childList=Arrays.asList(chandini,sb);
		//define relationship below
		rp.setListOfChids(childList);
		chandini.setFather(rp);
		sb.setFather(rp);
		
		Session session=factory.openSession();
		Transaction tr=session.beginTransaction();
		
		session.save(rp);
		session.save(sb);
		session.save(chandini);
		
		tr.commit();
		session.close();
		factory.close();
		
		
	}

}
