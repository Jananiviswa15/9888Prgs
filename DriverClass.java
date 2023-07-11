package Inheritance;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class DriverClass {

	public static void main(String[] args) {
		
		Person person = new Person();
		person.setGender("female");
		person.setName("supriya");
		
		Student std = new Student();
		std.setGender("female");
		std.setName("minal");
		std.setGrade(12);
		std.setSchoolName("DPS");
		
		Employee emp = new Employee();
		emp.setDesignation("GM");
		emp.setGender("male");
		emp.setName("ahsanullah");
		emp.setSalary(600000);
		
		Configuration config = new Configuration().configure().addAnnotatedClass(Person.class).addAnnotatedClass(Student.class).addAnnotatedClass(Employee.class);
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		session.beginTransaction();
		session.save(emp);
		session.save(std);
		session.save(person);
		session.getTransaction().commit();
		

	}

}
