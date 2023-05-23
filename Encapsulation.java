package oops;

public class Encapsulation {

	private int age;
	private String name;
	//attr and the methods will be combined or placed together

	public void setName(String userName) {
		if(userName.length() >= 3) {
			this.name = userName;
		}
	}
	
	public String getName() {
		return this.name;
	}
	public	void setAge(int userAage){ //-190  //write op
		if(userAage > 0) {
		this.age = userAage;  //obj.age = 90
	//	System.out.println("age is "+age);
		}
	}
	
	public int getAge() {
		return this.age;//read op  //obj.age
	}
	public static void main(String args[]) {
		Encapsulation obj = new Encapsulation();  //obj.age = 0
		obj.setAge(90);
		System.out.println(obj.getAge());

	}
}
