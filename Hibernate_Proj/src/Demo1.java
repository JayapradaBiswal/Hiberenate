import org.hibernate.Transaction;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Demo1
{
public static void main(String[] args) 
{
	Configuration cfg=new Configuration();
	cfg.configure();
	System.out.println("Configuration done");
	
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	
	Session session=sessionFactory.openSession();
	Transaction tr=session.beginTransaction();
	
	Mobile apple=new Mobile();
	apple.setBrand("Apple");
	apple.setPrice(67000.0);
	apple.setRamSize(6);
	
	Mobile mi=new Mobile();
	mi.setBrand("MI");
	mi.setPrice(20000.0);
	mi.setRamSize(4);
	
	Mobile sm=new Mobile();
	sm.setBrand("Samsung");
	sm.setPrice(25000.0);
	sm.setRamSize(5);
	
	//Serializable pk=session.save(mi);
	//Integer xyz=(Integer)pk;
	//int abz=xyz;
	//System.out.println(xyz);
	
	session.save(apple);
	session.save(mi);
	session.save(sm);
	tr.commit();
	
	System.out.println("Factory done");
}

}
