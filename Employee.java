import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;

public class Employee {

	@Autowired
	@Qualifier("adrsObj")
	//u dont need setter
	private Address adrs;
	
	
	public Employee() {
		System.out.println("no args con");
	}
	//@Autowired
	public Employee(Address adrs) {
		System.out.println("constr");
		this.adrs = adrs;
	}

	
/*@Autowired//byname , bytypoe(1st prioroty)
 * @Qualifier("adrsObj")
	public void setAdrs(Address adrs) {
		System.out.println("setter");
		this.adrs = adrs;
	}*/

	void display() {
		adrs.display();
	}
	
}
