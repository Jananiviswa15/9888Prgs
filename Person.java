package OneToMany;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.OneToMany;

@Entity
public class Person {

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer personId;
	
	@OneToMany(cascade = CascadeType.ALL, mappedBy = "person")
//	@JoinTable(name = "third_table", joinColumns = @JoinColumn(name = "firstCol"), inverseJoinColumns = @JoinColumn(name = "seconCol"))
	private List<BankAccount> bankAcnt = new ArrayList<BankAccount>();
	
	public List<BankAccount> getBankAcnt() {
		return bankAcnt;
	}

	public void setBankAcnt(List<BankAccount> bankAcnt) {
		this.bankAcnt = bankAcnt;
	}

	private String name;
	
	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public int getAge() {
		return age;
	}

	@Override
	public String toString() {
		StringBuilder builder = new StringBuilder();
		builder.append("Person [personId=").append(personId).append(", name=")
				.append(name).append(", age=").append(age).append("]");
		return builder.toString();
	}

	public void setAge(int age) {
		this.age = age;
	}

	private int age;

	
}
