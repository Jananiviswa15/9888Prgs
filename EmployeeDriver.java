package HibernatePrjcts.FirstPrjct;

import java.util.Scanner;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

public class EmployeeDriver {
	private static final Scanner scan = new Scanner(System.in);
	public static void main(String args[]) {
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class);
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		//readEmployeeDetails(session);
		//insertEmployee(session);
		//updateEmployeeDetails(session);
		deleteEmployee(session);

	}

	private static void deleteEmployee(Session session) {
		System.out.println("ENter id of the person for updating");
		int empId = scan.nextInt();
		Employee empFromDb = session.get(Employee.class, empId);
		if(empFromDb != null) {
			session.beginTransaction();
			session.delete(empFromDb);
			session.getTransaction().commit();
			session.close();
		}
		else
			System.out.println("emp with specified id is not present");
	}

	private static void updateEmployeeDetails(Session session) {

		System.out.println("ENter id of the person for updating");
		int empId = scan.nextInt();
		Employee empFromDb = session.get(Employee.class, empId);
		if(empFromDb != null) {
			System.out.println("Enter new mail id");
			empFromDb.setEmail(scan.next());
			System.out.println("Enter new name ");
			empFromDb.setEmployeeName(scan.next());
			session.beginTransaction();
			Integer updatedRecrdKey = (Integer)session.save(empFromDb);
			session.getTransaction().commit();
			session.close();
			System.out.println("updated record with id :"+ updatedRecrdKey);
		}
		else
			System.out.println("emp with specified id is not present");


	}

	private static void readEmployeeDetails(Session session) {
		System.out.println("ENter id of the person for searching");
		int empId = scan.nextInt();
		Employee empFromDb = session.get(Employee.class, empId);
		if(empFromDb != null)
			System.out.println(empFromDb);
		else
			System.out.println("emp with specified id is not present");

	}

	private static void insertEmployee( Session session) {
		session.beginTransaction();
		Integer insertedRecrdKey = (Integer) session.save(getEmployee());
		//session.persist(getEmployee());
		session.getTransaction().commit();
		System.out.println("Inserted record with id :"+insertedRecrdKey);
		session.close();

	}



	private static Employee getEmployee() {
		Employee empObj = new Employee();

		System.out.println("Enter emp name");
		empObj.setEmployeeName(scan.next());
		System.out.println("Enter emp email");
		empObj.setEmail(scan.next());
		return empObj;


	}



}
