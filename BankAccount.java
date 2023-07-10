package OneToMany;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;

@Entity
public class BankAccount {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer bankId;
	
	private String location;
	
	@ManyToOne
	private Person person;
	

	public Person getPerson() {
		return person;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("BankAccount [bankId=").append(bankId).append(", location=").append(location).append(", person=")
				.append(person).append("]");
		return builder.toString();
	}

	public void setPerson(Person person) {
		this.person = person;
	}

	public String getLocation() {
		return location;
	}

	public void setLocation(String location) {
		this.location = location;
	}
	
}
