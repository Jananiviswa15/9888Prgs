
public class Car implements Vehicle{

	public Car() {
		System.out.println("object craeted");
	}
	@Override
	public void accelerate() {
		System.out.println("press accelerator by your legs");
		
	}

	@Override
	public void transporatation() {
		System.out.println(" i will be able to transport 4 people");
		
	}

}
