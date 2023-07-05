package HibernatePrjcts.FirstPrjct;

import org.hibernate.annotations.DynamicUpdate;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//@Entity(name = "Employee details")
@Entity
@Table(name = "Employee details")
@DynamicUpdate
public class Employee {

	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name = "employee identifier")
	private Integer empId;
	
	@Column(name = "employee name",  nullable = false, length = 20)
	private String employeeName;
	
	
	@Column(name = "employee mail", unique = true, nullable = false )
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
