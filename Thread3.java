package multiThreading;

public class Thread3 extends Thread{

	public void run() {

		for(int ctr = 1; ctr <= 5; ctr++)
			try {
				Thread.sleep(5000);  //thread - 0 //thread - 1 
				System.out.println(ctr+currentThread().getName());
			}
		catch(InterruptedException exc) {
			System.out.println(exc);
		}
	}
	public static void main(String args[]) throws InterruptedException {
		Thread3 obj = new Thread3();
		Thread3 obj1 = new Thread3();
		//Thread3 obj3 = new Thread3();
		//		Thread3 obj4 = new Thread3();

		//obj3.start();
		obj.start(); //2 thread  //obj, main
		Thread.currentThread().sleep(6000);;
		obj1.start();

	}
}
