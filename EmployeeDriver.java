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
		//insertEmployee(session);
		readEmployeeDetails(session);
		
		//updateEmployeeDetails(session);
		//deleteEmployee(session);
		session.getSessionFactory().close(); //session fact -> close -> drop the table
	}

		private static void readEmployeeDetails(Session session) {
		System.out.println("ENter id of the person for searching");
		int empId = scan.nextInt();
		session.beginTransaction();
		Employee empFromDb = session.get(Employee.class, empId);
		System.out.println(session.contains(empFromDb));
		session.detach(empFromDb);  //evict()
		System.out.println(session.contains(empFromDb));
		if(empFromDb != null) {
			
			empFromDb.setEmail("jsahsdhsh");
		//dirty checking // u didnt call update, save
			session.getTransaction().commit();
			empFromDb.setEmployeeName("duummy"); //java side value got changed, no db changes 
			System.out.println(empFromDb);
		}
		else
			System.out.println("emp with specified id is not present");

	}

	private static void insertEmployee( Session session) {
		session.beginTransaction();
		Employee emp = getEmployee();
//persistent state
		Integer insertedRecrdKey = (Integer) session.save(emp);
		//session.persist(getEmployee());
		session.getTransaction().commit();
		System.out.println("Inserted record with id :"+insertedRecrdKey);
		session.close();

	}



	private static Employee getEmployee() {
		Employee empObj = new Employee();
		Address adrsObj = new Address();
		adrsObj.setDistrict("dist");
		adrsObj.setPincode(123);
		adrsObj.setState("hi");
		System.out.println("Enter emp name");
		empObj.setEmployeeName(scan.next());
		System.out.println("Enter emp email");
		empObj.setEmail(scan.next());
		empObj.setAdrs(adrsObj);
		return empObj;

//2 objs is jvm --> transients --> not in db not in session
	}



}
