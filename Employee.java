package HibernatePrjcts.FirstPrjct;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Embeddable;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.SequenceGenerator;
import jakarta.persistence.Table;
import jakarta.persistence.Transient;

//@Entity(name = "Employee details")
@Entity
@Table(name = "Employee details")
@DynamicUpdate
public class Employee {

	//identity // ai //from 1 and inc by 1
	//auto --> pk is by hiber, extra table
	//default is auto gener for pk
	//sequence --> pk is by db, extra table
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee identifier")
	private Integer empId;
	
	@Column(name = "employee name",  nullable = false, length = 20)
	private String employeeName;
	
	//@Embeddable
	private Address adrs;
	
public Address getAdrs() {
		return adrs;
	}

	public void setAdrs(Address adrs) {
		this.adrs = adrs;
	}

	//	@Column(name = "employee mail", unique = true, nullable = false )
	//@Transient
	private String email;
	
	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Employee [empId=").append(empId).append(", employeeName=").append(employeeName)
				.append(", email=").append(email).append("]");
		return builder.toString();
	}

	public String getEmployeeName() {
		return employeeName;
	}

	public void setEmployeeName(String employeeName) {
		this.employeeName = employeeName;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	
}
