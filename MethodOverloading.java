package oops;

public class MethodOverloading {
//static , non stat , main	
	void add(int num1, int num2) {
		System.out.println(num1+num2);
	}
	
	void add(int num1, float num2) {
		System.out.println(num1+num2);
	}
	
	void add(float num1, int num2) {
		System.out.println(num1+num2);	
	}
		
	void add(float num1, float num2) {
		System.out.println(num1+num2);
	}
	

	void add(int num1, int num2, int num3) {
		System.out.println(num1+num2+num3);
	}
	static void display() {
		System.out.println("hi");
	}
	
	//cant overload by return tyoe
//	static int display() {
//		System.out.println("hi");
//	}
	static void display(String name) {
		System.out.println("hi"+name);
	}
	
	 void display(String name, String name1) {
		System.out.println("hi"+name);
	}
	 
	 void display(String name, int num) {
			System.out.println("hi"+name);
		}
	public static void main(String name) {
		System.out.println("hi");
	}
	public static void main(String args[]) {
		main("jana");
		
		
		MethodOverloading obj = new MethodOverloading();
		obj.add(0.0f, 0.0f); //type of para
		obj.add(10, 0.0f); //order
		
		obj.display("ja", "dfdf");  //no of para
	}
}
