package ExceptionHandling;

//throw --> checked / unchecked / custom

class MyException extends Exception{

	MyException(String exceptMsg){
		super(exceptMsg);
	}
}
public class ExcPrg3 {

	static void toValidateName(String name) throws MyException{
//		try {
			if(name == null)
				throw new NullPointerException("name cant be null");
			else if(name.length() <= 3)
				throw new RuntimeException("name length should be atleast 5");
			else if(name.equals(" "))
				throw new MyException("name cant be empty");
			else {
				System.out.println("name is valid");
			}
//	}
//		catch(MyException excp) {
//			System.out.println(excp);
//		}

	}
	static void toValidateAge(int age) {
		if(age < 18)
			throw new ArithmeticException("age is not eleigible");

		//throw new Exception("age is not eleigible");
		else
			System.out.println("u r eligible");
	}
	public static void main(String args[])  throws ArithmeticException{
		String name = " ";
		int age = 4;
		//toValidateAge(age);
		int result = 14 / 0;
		try {
		toValidateName(name);
		}
		catch(MyException excp) {
			System.out.println(excp);
		}
//		catch(ArithmeticException exc) {
//			System.out.println(exc);
//		}
	}
}
