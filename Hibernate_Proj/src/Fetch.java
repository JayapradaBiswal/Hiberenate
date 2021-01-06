import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class Fetch
{
public static void main(String[] args) 
{
	Configuration cfg=new Configuration();
	cfg.configure();
	System.out.println("Configuration done");
	
	SessionFactory sessionFactory=cfg.buildSessionFactory();
	System.out.println("Factory done");
	
	Session session=sessionFactory.openSession();
	
	
	Mobile mb=session.get(Mobile.class, new Integer(4));
	System.out.println(mb);
	
	session.close();
	sessionFactory.close();
}

}
