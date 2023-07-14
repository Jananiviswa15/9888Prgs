package BeanCreation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
//it replcmnt of ur xml
//@ComponentScan(basePackages =  {"BeanCreation", "package2"})

@ComponentScan(basePackages =  "BeanCreation")
public class MyCOnfig {
/*
	
	//@Bean(name = {"anothername", "name1", "name2"}) --> for one obj
	//@Bean(name = "anothername")
	@Bean
	//method name - bean naem
	public Amazon amazonBean() {
		Amazon amazonObj = new Amazon(createManagerBean(), craeteDevBean());
		//amazonObj.setDev(craeteDevBean());
	//	amazonObj.setManager(createManagerBean()); SI
		return  amazonObj;
	}
	
	
	
	@Bean
	public Developers craeteDevBean() {
		return new PythonDeveloper();
	}
	@Bean
	public Manager createManagerBean() {
		return new Manager();
	}
*/	
	
}
