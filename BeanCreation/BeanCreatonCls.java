package BeanCreation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class BeanCreatonCls {

	public static void main(String[] args) {
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("NewFile2.xml");
		
		AnnotationConfigApplicationContext appContext = new AnnotationConfigApplicationContext(MyCOnfig.class);
		Amazon obj = appContext.getBean("amazon", Amazon.class);
		obj.test();

		//((AnnotationConfigApplicationContext)appContext).close();
		appContext.close();
	}

}
