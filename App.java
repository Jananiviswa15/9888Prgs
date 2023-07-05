package HibernatePrjcts.FirstPrjct;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
    	
    	
      Employee emp5 = new Employee();
      emp5.setEmail("fifth@gmail.com");
      emp5.setEmployeeName("fifthEmp");
      
      Employee emp6 = new Employee();
      emp6.setEmail("sixth@gmail.com");
      emp6.setEmployeeName("sixthEmp");
     Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
     SessionFactory sessionFact = config.buildSessionFactory();
     Session session = sessionFact.openSession();
     session.beginTransaction();
     session.save(emp5);
     session.save(emp6);
     session.getTransaction().commit();
     session.close();
     
     
    }
}
