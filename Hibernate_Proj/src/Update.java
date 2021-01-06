
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Update
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
	Mobile mi=session.get(Mobile.class, new Integer(2));
	System.out.println(mi);
	
	mi.setBrand("Realmi");
	session.update(mi);
	tr.commit();
	
	session.close();
	sessionFactory.close();
}

}
