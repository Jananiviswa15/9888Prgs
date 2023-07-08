package OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bankId;
	
	private String location;

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BankAccount [bankId=").append(bankId).append(", location=").append(location).append("]");
		return builder.toString();
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
