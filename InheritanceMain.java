package oops;

public class InheritanceMain {

	public static void main(String args[]) {
//		Mobile mobile = new Mobile();
//	//	mobile.myPersonalNote();  // outside the class
//		mobile.calling();
//		mobile.displaydetails();
//		
//		Mobile mobile1 = new Mobile(23000, "samsung");
//		mobile1.calling();
//		mobile1.displaydetails();
		
//		keypadPhone child = new keypadPhone();
//		child.calling();
//		child.displaydetails();
//		child.getInsurance();
		//child --> istorch avail, String brandName;		int cost;
		//child obj gets created , parent obj is not created but a copy of parent attr and methods are provide to child
		
//		keypadPhone child1 = new keypadPhone(true);
//		child1.displaydetails();
//		
//		keypadPhone child2 = new keypadPhone(true, "nokia",5000);
//		child2.displaydetails();
//		
//		SmartPhone smartph = new SmartPhone();
//		smartph.displaydetails();
//		
//		SmartPhone smartPh1 = new SmartPhone(true,(short) 5,(short) 48, "samsung", 20000);
//		smartPh1.displaydetails();
//		smartPh1.calling();
//		
//		Sibiling sib1 = new Sibiling();
//		sib1.display();
//		System.out.println(smartPh1 instanceof SmartPhone);
//		System.out.println(smartPh1 instanceof keypadPhone);
//		System.out.println(smartPh1 instanceof Mobile);

		
//		Mobile.sayHi();
//		keypadPhone.sayHi();
//		System.out.println(keypadPhone.manufacturingYear);
//		
		Mobile mobileObj = new keypadPhone();  //rt
		mobileObj.displaydetails();
		mobileObj.rulesAndRegulations();
		//keypadPhone keypad1 = new Mobile(); not possible
		
		
		mobileObj.sayHi();
	} 
}
