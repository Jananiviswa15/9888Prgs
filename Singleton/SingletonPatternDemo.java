package Singleton;

public class SingletonPatternDemo {

	public static void main(String[] args) {
			SingleObject object1 = SingleObject.getInstance(); 
			//SingleObject object = new SingleObject();
	SingleObject object2 = SingleObject.getInstance();
		object1.showMessage();
		object2.showMessage();
		}
}
