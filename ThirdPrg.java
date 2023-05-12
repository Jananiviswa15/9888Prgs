
public class ThirdPrg {
	//non stat / instance    inside a class but outside all the methods, u need to create obj
	//static var / class
	//local vari , inside a method
	//parametrs
	boolean isActive;
	int num; //defal

	static int questions; //decl
	static boolean isMarried;
	
	static{ //stat block
		System.out.println("i am stat");
		questions = 20;
	}
	static int noOfAssessments = 10; //static , u dont need to create obj
	static void sayHi(int age){ //param - loc var  //def
		System.out.println("my age is "+age); //str concat
		//
		int num;
		System.out.println("hi i am from sayHi method");
		System.out.println(10+10);

		System.out.println("10 "+10);
		System.out.println(34+12+90+"10"+10);  //136 1010
		System.out.println("skdkd"+true);
	}

	void display() {
		System.out.println("example of non static");
	}

	public static void saySalaryOfShruti() {
		//	System.out.println(salary);
		int salary = 40000;
		boolean isSruthiSleeping = true;
		System.out.println(salary);
		System.out.println(isSruthiSleeping);		


	}//mem allocated for loc var get released
	public static void main(String args[]) {
System.out.println("i am main");
		//	ThirdPrg.saySalaryOfShruti();
		int salary = 12000;
		System.out.println(salary);
		//saySalaryOfShruti();
		sayHi(56); //method call
		ThirdPrg obj2;
		//obj2.num; skeleton
		//cn objname = new cn();
		ThirdPrg obj1 = new ThirdPrg();	 //obj def //type of obj lhs
		//obj1 --> see rhs
		obj1.num = 10;
		System.out.println(obj1.num);
		System.out.println(obj1.isActive); //def val
		obj1.display();

		obj2 = new ThirdPrg();
		//real --> u can acses methds nd attr of the cls
		System.out.println(obj2.num);  //0
		System.out.println(obj2.isActive);// false
		obj2.display();
		obj2.isActive = true;
		System.out.println(obj2.isActive);
		System.out.println(noOfAssessments);	
		noOfAssessments = 500;
		System.out.println(noOfAssessments);
		System.out.println(isMarried);
	}
}
