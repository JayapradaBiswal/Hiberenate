package com.hql.app;
import java.util.Arrays;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import singleton.HibernateUtil;

public class Fetch {
	public static void main(String[] args) {
		SessionFactory sessionFactory = HibernateUtil.buildSessionFactory();

		Session session = sessionFactory.openSession();
		// we need Query object to execute HQl

		//Query<Student> query = session.createQuery("select s from Student s where name like ?  or age > ?");
		//query.setParameter(0, "%A");
		//query.setParameter(1, 21);
		
		              //or//
		
		//Query<Student> query = session.createQuery("from Student where name like :name  or age > :age");
		//query.setParameter("name", "%A");
		//query.setParameter("age", 21);
		
		//List<Student> list = query.list();
		//for (Student s : list) {
		//	System.out.println(s);
		//}
		
		//Query<Object[]> query = session.createQuery("select age,name from Student  where name = :name");
		//query.setParameter("name", "Kshitij Joshi");
		//Object[] objectdata=query.uniqueResult();
		//System.out.println(Arrays.toString(objectdata));
		
	//	Query<Object[]> query = session.createQuery("select age,name from Student  where age > :age");
	//	query.setParameter("age", 20);
	//	List<Object[]> list=query.list();
	//	for(Object[] objects: list)
	//	{
	//	System.out.println(Arrays.toString(objects));
	//	}
		
		Query<Integer> query = session.createQuery("select age from Student  where name = :name");
				query.setParameter("name", "Kshitij Joshi");
				int data=query.uniqueResult();
				System.out.println(data);
	}
}