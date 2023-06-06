package multiThreading;

public class Thread2 implements Runnable{
	public void run() {
		System.out.println(" thread started");
	}
	
	public static void main(String args[]) {
		Thread2 obj = new Thread2();
	Thread threadObj1 = new Thread(obj); //4th 
	Thread threadObj2 = new Thread(obj);
//	System.out.println(threadObj1.getName());
//	System.out.println(threadObj2.getName());
	threadObj1.setPriority(10);
	System.out.println(threadObj1.getPriority());
	System.out.println(threadObj2.getPriority());
	System.out.println(threadObj1.getPriority());
		Thread threadObj = new Thread(obj, "myownThreadName"); //3rd type
		threadObj.start();
//		System.out.println(threadObj.getName());
		System.out.println(threadObj.getPriority());
	}
}
