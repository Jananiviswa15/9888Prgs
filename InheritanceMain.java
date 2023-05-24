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
		keypadPhone child2 = new keypadPhone(true, "nokia",5000);
		child2.displaydetails();
	} 
}
