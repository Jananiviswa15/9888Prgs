package OneToMany;

import OneToOne.Employee;
import OneToOne.EsatblishConnect;
import OneToOne.Mobile;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;
public class DriverClass {
	static void insertPersonAdrss(Session session){
		
		BankAccount obj1 = new BankAccount();
		obj1.setLocation("agra");
		BankAccount obj2 = new BankAccount();
		obj2.setLocation("cochin");
		Person person = new Person();
		person.setAge(20);
		person.setName("priya");
		person.getBankAcnt().add(obj2);
		person.getBankAcnt().add(obj1);
		
		session.beginTransaction();
		session.save(person);
		session.getTransaction().commit();
	
	}
	
	static void fetchData(Session session) {
		Person person = session.get(Person.class, 1);
		System.out.println(person);
		
	}
	public static void main(String[] args) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(BankAccount.class);
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
	//insertPersonAdrss(session);
		fetchData(session);
	}

}
