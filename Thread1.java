package multiThreading;

public class Thread1 extends Thread{

	//
	public void run() {
		System.out.println(" thread started");
	}
	
	//states --> new,active --> ready to do some work (runnable)/ it is doing a work(running), blocked state, waiting state, terminated
	public static void main(String args[]) {
		//extends thread class, implementing runnable interfcae
		Thread1 firstThread = new Thread1();  //1st
		System.out.println(firstThread.getName());
	//	firstThread.run(); //u can call directly calll run method,seaparate call stack wont be created
		firstThread.start(); //seprate call stack is created
		
		Thread secondThreadObj = new Thread("secondThread"); //2nd type
		System.out.println(secondThreadObj.getName());
//		secondThreadObj.start();
//		
		
		
	}
}
