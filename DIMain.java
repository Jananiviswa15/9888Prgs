import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DIMain {

	public static void main(String[] args) {
//		Person person = new Person();
//		person.setAge(10);
//		person.setGender("female");
//		person.setName("pavni");
//		person.display();
		
		ApplicationContext appContext = new ClassPathXmlApplicationContext("dependency.xml");
		Person person = (Person) appContext.getBean("personObj");
		
	//	Person person = appContext.getBean(Person.class, "obj");
		person.display();
	}

}
