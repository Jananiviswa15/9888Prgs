package OneToOne;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;





public class EsatblishConnect {
	static Session connectToDB() {
		Configuration config = new Configuration().configure().addAnnotatedClass(Employee.class).addAnnotatedClass(Mobile.class);
		SessionFactory sessionFact = config.buildSessionFactory();
		Session session = sessionFact.openSession();
		return session;

	}
	
	static void getEmpAndAdrsByEmpId(){
		Session getSession = connectToDB();
		Employee empFromDb = getSession.get(Employee.class, 1);

		if(empFromDb != null) {
			System.out.println(empFromDb);
		}
		else
			System.out.println("not available");
			
	}
	public static void main(String args[]) {

//		Mobile mob = new Mobile();
//		mob.setBarndName("samsung");
//		mob.setTotalCost(1000);
//
//		Employee firstEmp = new Employee();
//		firstEmp.setEmpName("vijay");
//		firstEmp.setSalary(10000);
//		firstEmp.setMobile(mob);
		
		Session getSession = connectToDB();
		getEmpAndAdrsByEmpId();
		getSession.beginTransaction();
//		getSession.save(mob);
//		getSession.save(firstEmp);
	//	getSession.save(firstEmp);  //save parent auto save the child obj
		
		//	getSession.persist(firstEmp);  
		getSession.getTransaction().commit();
	}
}
