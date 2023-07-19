package FactoryPattern;

public class ATM {

	
	private Printer printer;

	public Printer getPrinter() {
		return printer;
	}

	public void setPrinter(Printer printer) {
		this.printer = printer;
	}
	
	
	public void printBalance(String accNum) {
	printer.displayAccountBalance(accNum);
	}
	/*private static final ATM atmObj = new ATM();
	
	
	//only one obj
	private ATM(){
		System.out.println("constr created..");
	}
	
	public static ATM getATMObj() {
		return atmObj;
	}
	
	public void display() {
		System.out.println("hi all");
	}*/
}
