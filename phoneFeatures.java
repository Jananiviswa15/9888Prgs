package oops;

interface phoneFeatures {
//cant create instance var 
	//attr --> public static final
	 String brandName = "samsung";
	
	 //public abstract
	void calling();
	void messaging();
	
	//u cant create object for interfcae
	//no constr, no main
	
	default  void setwallperFeature() {
		personalNote();
		System.out.println("i will set wall paper");
	}
	
	private  void personalNote() {
		phoneFeatures.personalNote1();
		System.out.println(" i am private method");
	}
	
	private static void personalNote1() {
		
		System.out.println(" i am private method1");
	}
}


interface phoneAdvFeatures{
	void messaging();
	void cameraFunctionalities();
}

interface mediumPhoneFeatures extends phoneAdvFeatures, phoneFeatures{
	void internetOptions();
}