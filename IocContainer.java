import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class IocContainer {
	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("NewFile.xml");
	/*	Car car1 = (Car) appContext.getBean("carObj");
		Car car2 =  appContext.getBean(Car.class,"carObj");
		car2.accelerate();
		car2.transporatation();
		
		car1.accelerate();
		car1.transporatation();*/
		/*Bike car2 =  appContext.getBean(Bike.class,"bikeObj");
		car2.accelerate();
		car2.transporatation();*/
		
		Vehicle vech =  appContext.getBean(Bike.class,"bikeObj");
		Vehicle vech1 =  appContext.getBean(Car.class,"carObj");
	}
}
