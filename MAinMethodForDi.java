import org.springframework.beans.factory.BeanFactory;
import org.springframework.beans.factory.xml.XmlBeanFactory;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.core.io.ClassPathResource;
import org.springframework.core.io.Resource;

public class MAinMethodForDi {

	public static void main(String[] args) {
		
		  Resource resource=new ClassPathResource("ConstrInject2.xml");  
	        BeanFactory ioc=new XmlBeanFactory(resource);  
		//ApplicationContext appContext = new ClassPathXmlApplicationContext("ConstrInject2.xml");
		Mobile mobileObj = ioc.getBean("myMobile2", Mobile.class);
		mobileObj.displayMobileDetails();

	}

}
