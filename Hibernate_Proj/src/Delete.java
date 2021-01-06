
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Delete
{
public static void main(String[] args) 
{
	Configuration cfg=new Configuration();
	cfg.configure();
	System.out.println("Configuration done");
	
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	System.out.println("Factory done");
	
	Session session=sessionFactory.openSession();
	
	Transaction tr=session.beginTransaction();
	Mobile m=session.get(Mobile.class, new Integer(2));
	
	session.delete(m);
	
	tr.commit();
	session.close();
	sessionFactory.close();
}

}
