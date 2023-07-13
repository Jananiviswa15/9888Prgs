
public class Mobile {

	
//	public Mobile() {
//		System.out.println("mobile craeted..");
//	}

	private Display adrs; // Display adrs= new ManufaturingArs()
	
	public Mobile(Display adrs, Display lcdAttr) {
		
		this.adrs = adrs;
		this.lcdAttr = lcdAttr;
	}

	private Display lcdAttr; // Display lcdAttr= new ManufaturingArs()
	 
	
	public void setLcdAttr(LCD lcdAttr) {
		this.lcdAttr = lcdAttr;
	}

	public void setAdrs(ManufacturingAdrs adrs) {
		System.out.println("setter inject");
		this.adrs = adrs;
	}

	public void displayMobileDetails() {
		adrs.display();
		lcdAttr.display();
	}
}
