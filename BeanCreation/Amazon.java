package BeanCreation;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

//@Component("new name")
//equivalent to xml <bean id creation
//class name -> obj name --> amazon, amazonCls
@Component
public class Amazon {

	@Value("BOSS")
	String CEO;
	
	@Autowired
	private Manager manager;
	
	@Autowired
	private Developers dev; //java / python

//	@Autowired
	public Amazon(Manager manager, Developers dev) {
		this.manager = manager;
		this.dev = dev;
	}
	
	/*@Autowired
	@Qualifier("javaDeveloper")
	public void setDev(Developers dev) {
		this.dev = dev;
	}
	
	@Autowired
	public Amazon(Manager manager) {

		this.manager = manager;
	}*/
	//	public void setManager(Manager manager) {
	//		this.manager = manager;
	//	}
	public Amazon() {
		System.out.println("obj created");
	}
	void test() {
		manager.managerInfo();
		dev.developApplications();
		System.out.println("i am wrkng under "+CEO);
	}
}
