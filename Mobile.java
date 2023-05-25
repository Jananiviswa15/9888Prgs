package oops;
/* sl --> mobile --> keypad
 * ml --> great gp -> gp -> pa --> child
 */
public class Mobile { //super

	String brandName;
	int cost;

	Mobile(){
		//myPersonalNote();
		System.out.println("no arg cons l1");
	}

	Mobile(int cost){
		this.cost = cost;
	}
	Mobile(int cost, String brandName){
		this(cost);
		this.brandName = brandName;
	}

	void calling() {
		System.out.println("calling");
	}

	private void myPersonalNote() {
		System.out.println("dont touch");
	}

	public void displaydetails() {
		System.out.println(this.brandName+" "+this.cost);
	}

	public void getInsurance() {
		System.out.println("insurance");
	}
}


class keypadPhone extends Mobile{  //sub
	//all the obj of keypad can aces att and method of parent

	boolean isTorchAvailable;

	public keypadPhone() {
		System.out.println("no arg cons from child");
	}

	keypadPhone(boolean isTorchAvailable){
		this.isTorchAvailable = isTorchAvailable;
	}

	//true, "samsung", 20000
	keypadPhone(boolean isTorchAvailable, String brandName,int cost ){
		// "samsung", 20000
		super(cost, brandName);
		this.isTorchAvailable = isTorchAvailable;
		//this(isTorchAvailable);
		//		this.brandName = brandName;
		//		this.cost = cost;

	}

	//method overriding
	void calling() {
		System.out.println("press buttons to call");
	}

	public void displaydetails() {
		super.displaydetails();
		System.out.print( this.isTorchAvailable);
		//System.out.println(this.brandName+" "+this.cost+" "+ this.isTorchAvailable);
	}

	void sendMessages() {
		System.out.println("message");
	}
}


class SmartPhone extends keypadPhone{

	short screenSize;
	short camerPx;

	SmartPhone(){
		System.out.println("no arg from smart ph");
	}

	SmartPhone(short screenSize){
		this.screenSize = screenSize;
	}
	SmartPhone(short screenSize,	short camerPx){
		this(screenSize);
		this.camerPx = camerPx;
	}

	SmartPhone(boolean isTorchAvailable, short screenSize,	short camerPx, String brandName, int cost){
		//super(isTorchAvailable);
		/*this.screenSize = screenSize;
		this.camerPx = camerPx;*/
			//	this(screenSize, camerPx);
		//		this.isTorchAvailable = isTorchAvailable;
		//this.brandName = brandName;
//		this.cost = cost;
//		
		//true,(short) 5,(short) 48, "samsung", 20000
		//true, "samsung", 20000
		super(isTorchAvailable, brandName, cost);
		this.screenSize = screenSize;
		this.camerPx = camerPx;
	}
	
	public void displaydetails() {
		super.displaydetails();
		System.out.print(this.screenSize+" "+ this.camerPx);
	}
	
	
	public void displaydetails(String greet) {
		super.displaydetails();
		System.out.print(this.screenSize+" "+ this.camerPx);
		System.out.println("hi all");
	}
	
	public void calling() {
		System.out.println("touch to call");
	}
}
