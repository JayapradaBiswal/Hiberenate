package com.hql.app;
import java.util.List;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import singleton.HibernateUtil;
//persistance logic has to writen in this case
public class StudentDao 
{
 private SessionFactory factory=HibernateUtil.buildSessionFactory();
public StudentDto findByName(String name)
{
	StudentDto studentDto=null;
	try( Session session=factory.openSession())
	{
	Query<StudentDto> query = session.createQuery(" from StudentDto  where name = :n");
			query.setParameter("n", name);
			studentDto=query.uniqueResult();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return studentDto;
}
public Object[] findAgeAndPercentageByName(String name)
{
	Object[] objectdata=null;
	try( Session session=factory.openSession())
	{
	Query<Object[]> query = session.createQuery("select age,percentage from StudentDto  where name = :n");
			query.setParameter("n", name);
			objectdata=query.uniqueResult();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return objectdata;
}
public List<StudentDto> findAllByAgeGreaterThan(int age)
{
	List<StudentDto> list=null;
	try( Session session=factory.openSession())
	{
	 Query<StudentDto> query = session.createQuery("from StudentDto where  age > :age");
	query.setParameter("age", age);
	list = query.list();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return list;
}
public double findPercentageByName(String name)
{
	float data=0.0f;
	try( Session session=factory.openSession())
	{
	Query<Float> query = session.createQuery("select percentage from StudentDto  where name = :name");
	query.setParameter("name", "Kshitij Joshi");
	 data=query.uniqueResult();
	}
	catch(Exception e) {
		e.printStackTrace();
	}
	return data;
	}
public List<Object[]> findStreamAndPercentageAndNameByAgeLessThan(int age)
		{
	List<Object[]> list=null;
	try( Session session=factory.openSession())
	{
			 Query<Object[]> query = session.createQuery("select stream,percentage,name from StudentDto where age < :age");
				query.setParameter("age", 21);
				 list= query.list();
		}
catch(Exception e) {
	e.printStackTrace();
}
			return list;
			
		}
}



