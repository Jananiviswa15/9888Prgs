package FactoryPattern;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainClass {

	public static void main(String[] args) {
		ApplicationContext appContext = new ClassPathXmlApplicationContext("Config.xml");
		ATM fromIOC = appContext.getBean("atmObj", ATM.class);
		fromIOC.printBalance("6758656");

	}

}
