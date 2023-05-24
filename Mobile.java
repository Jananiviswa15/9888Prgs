package oops;

public class Mobile { //super

	String brandName;
	int cost;

	Mobile(){
		//myPersonalNote();
		System.out.println("no arg cons");
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

	keypadPhone(boolean isTorchAvailable, String brandName,int cost ){
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
		System.out.println( this.isTorchAvailable);
		//System.out.println(this.brandName+" "+this.cost+" "+ this.isTorchAvailable);
	}

	void sendMessages() {
		System.out.println("message");
	}
}
