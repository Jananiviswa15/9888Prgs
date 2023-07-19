package FactoryPattern;

public class PrintObjFactory {

/*	public static Printable getPrintObj() {
		return new Printer();
		//return new ColourPrinter();
	} type 2*/
	
	
	/*PrintObjFactory(){
		System.out.println("constructor craeted");
	}
	public  Printable getPrintObj() {
		return new Printer();
		//return new ColourPrinter();
	}  type 3*/
	
public static Printer getPrintObj() {
	return new Printer();
}
}
