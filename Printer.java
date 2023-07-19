package FactoryPattern;

public class Printer implements Printable{

	@Override
	public void print() {
		System.out.println("normal printer");
		
	}

	public void displayAccountBalance(String accNum) {
		System.out.println(" you have good amount in "+ accNum);
		
	}

	
}
