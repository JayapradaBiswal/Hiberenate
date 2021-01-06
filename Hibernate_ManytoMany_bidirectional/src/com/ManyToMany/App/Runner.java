package com.ManyToMany.App;

import java.util.*;

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
		
		//create objects
		Teacher shishiraSir=new Teacher();
		shishiraSir.setName("Shishira Sir");
		shishiraSir.setTeachesSubject("JAVA");
		
		Teacher vivekSir=new Teacher();
		vivekSir.setName("Vivek Sir");
		vivekSir.setTeachesSubject("JAVA");
		
		Teacher nageshSir=new Teacher();
		nageshSir.setName("Nagesh Sir");
		nageshSir.setTeachesSubject("SQL");
		
		Teacher nikhilaMam=new Teacher();
		nikhilaMam.setName("Nikhila Mam");
		nikhilaMam.setTeachesSubject("SQL");
		
		Student ashok=new Student();
		ashok.setName("Ashok");
		ashok.setGender('M');
		
		Student gopi=new Student();
		gopi.setName("Gopi");
		gopi.setGender('M');
		
		Student kishan=new Student();
		kishan.setName("Kishan");
		kishan.setGender('M');
		

		Student satya=new Student();
		satya.setName("Satya");
		satya.setGender('M');
		
		Student suraj=new Student();
		suraj.setName("Suraj");
		suraj.setGender('M');
	//list for teacher
		List<Student> studentListForShishiraSir=Arrays.asList(ashok,gopi,satya);		
		List<Student> studentListForVivekSir=Arrays.asList(kishan);
		List<Student> studentListForNageshSir=Arrays.asList(ashok,gopi,kishan);	
		List<Student> studentListForNikhilaMam=Arrays.asList(suraj,satya);	
		//list for students
		List<Teacher> teachersListForAshok = Arrays.asList(shishiraSir,nageshSir);
		List<Teacher> teachersListForGopi = Arrays.asList(shishiraSir,nageshSir);
		List<Teacher> teachersListForKishan = Arrays.asList(vivekSir,nageshSir);
		List<Teacher> teachersListForSatya = Arrays.asList(shishiraSir,nikhilaMam);
		List<Teacher> teachersListForSuraj = Arrays.asList(nikhilaMam);
		
		//relationship
		shishiraSir.setStudents(studentListForShishiraSir);
		vivekSir.setStudents(studentListForVivekSir);
		nageshSir.setStudents(studentListForNageshSir);
		nikhilaMam.setStudents(studentListForNikhilaMam);

		ashok.setTeachers(teachersListForAshok);
		gopi.setTeachers(teachersListForGopi);
		kishan.setTeachers(teachersListForKishan);
		satya.setTeachers(teachersListForSatya);
		suraj.setTeachers(teachersListForSuraj);
		
		
		session.save(shishiraSir);
		session.save(vivekSir);
		session.save(nageshSir);
		session.save(nikhilaMam);
		session.save(ashok);
		session.save(gopi);
		session.save(kishan);
		session.save(satya);
		session.save(suraj);
		
		tr.commit();
		session.close();
		factory.close();
		
		
	}

}
