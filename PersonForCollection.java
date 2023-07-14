import java.util.List;

public class PersonForCollection {

	private String name;
	public PersonForCollection(String name, int age, List<String> impCards) {
		this.name = name;
		this.age = age;
		this.impCards = impCards;
	}

	//	public void setName(String name) {
	//		this.name = name;
	//	}
	//	public void setAge(int age) {
	//		this.age = age;
	//	}
	//	public void setImpCards(List<String> impCards) {
	//		this.impCards = impCards;
	//	}
	private int age;
	private List<String> impCards;

	void display() {
		System.out.println(name +" "+age);
		System.out.println(impCards);
	}
}
