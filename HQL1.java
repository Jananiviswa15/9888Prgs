package HQL;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

import jakarta.persistence.Query;



public class HQL1 {
	public static void main(String args[]) {
		
//		Employee emp1 = new Employee();
//		emp1.setEmail("first@gma");
//		emp1.setName("firstEmp");
//		
//		Employee emp2 = new Employee();
//		emp2.setEmail("sec@gmail");
//		emp2.setName("secondEmp");
//		
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		session.beginTransaction();
//		Query query = session.createQuery("update Employee set name = :newname where name = :name");
//		query.setParameter("newname", "minal");
//		query.setParameter("name", "secondEmp");
//		int noOfrecordsUpdated = query.executeUpdate();
//		System.out.println(noOfrecordsUpdated);
//		
		
//		Query query = session.createQuery("Delete from Employee where empId = :id");
//		query.setParameter("id", 1);
//		int noOfrecordsUpdated = query.executeUpdate();
//		System.out.println(noOfrecordsUpdated);

		
//		Query query = session.createQuery("insert into Employee(name, email) "+
//		"select name, email from Employee where  empId = :id");
//		query.setParameter("id", 2);
		
		Query query = session.createQuery("insert into Employee(name, email) values(:userName, :userMail)");
		query.setParameter("userName", "jana");
		query.setParameter("userMail", "janagma");
		int rowCopied = query.executeUpdate();
		
		session.getTransaction().commit();
	}
}
