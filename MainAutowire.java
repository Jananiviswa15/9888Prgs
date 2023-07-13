import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainAutowire {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("NewFile1.xml");
		Employee emp = appContext.getBean("emp", Employee.class);
		emp.display();
	}

}
