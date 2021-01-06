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
	
	Alcohol bd=new Alcohol();
	bd.setName("Rum");
	bd.setQuantity("1ltr");
	bd.setBrand("Bacardi");
	bd.setPrice(2000);
	
	Alcohol rs=new Alcohol();
	rs.setName("Whisky");
	rs.setQuantity("1ltr");
	rs.setBrand("Royal_Stag");
	rs.setPrice(1000);
	
	Alcohol  ib=new Alcohol();
	ib.setName("Vodka");
	ib.setQuantity("1ltr");
	ib.setBrand("Smirnoff");
	ib.setPrice(1500);
	
	session.save(bd);
	session.save(rs);
	session.save(ib);
	tr.commit();
	session.close();
	sessionFactory.close();
	
	System.out.println("Factory done");
}

}
