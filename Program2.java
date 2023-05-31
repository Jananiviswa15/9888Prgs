package ExceptionHandling;

import java.util.Scanner;
public class Program2 {

	private static final Scanner scan = new Scanner(System.in);
	/*try{
	 * }
	 * catch(){
	 * }
	 * try{
	 * }
	 * catch(){
	 * }
	 * finally{
	 * }
	 * try{
	 * }
	 * finall{
	 * }
	 * 
	 */
	//multiple catch blocks --> specific to general


	public static void main(String args[]) {
		System.out.println("hi");
		int upper = scan.nextInt();
		int lower = scan.nextInt();
		try {
			//which might craete prblms
			//this line work
		//	int num = upper / lower;
			String name = null;
			System.out.println(name.length());
			System.out.println(" i am from try");

		}

		catch(NullPointerException exc) {
		//	System.out.println(exc.getMessage());
			exc.printStackTrace();
			//call any method
			System.out.println("hi i am from null ptr block");
		}
		/*catch(ArithmeticException exc) {
			System.out.println(exc);
			//call any method
			System.out.println("hi i am from ");
		}
		catch(RuntimeException runtimeExc) {
			System.out.println(" i am unchecked");
		}
		catch (Exception e) {
			System.out.println(e);
		}*/
		finally {
/*
 * there is exception i handled
 * there is exception i didnt handled
 * there is no excpe
 */
			//call a method 
			//do logic
			//it will execute no matter what 
			System.exit(0);
			System.out.println(" i will always exe");
		}
		//70 l 
		//catch --> 1000l   //50l
		//70l
		//catch --> 500l   //500l
		//catch 50l       //1000l
	}
}
