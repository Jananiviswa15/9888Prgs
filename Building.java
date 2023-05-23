package oops;

public class Building {

	String ownerName;
	static String builderName;
	static {
		builderName = "ABC";
		//		displayBuilderName();
		//		Building owner1 = new Building();
		//		owner1.displayOwnerDetails();
	}
	boolean isSmartHome;
	int noOfRooms;

	Building(){ // no arg cons
		System.out.println(" i am constr");
		//		builderName = "hello";
		//		displayBuilderName();
		//		displayOwnerDetails();

	}


	//owner2
	//this --> current class object ref
	//"SURAJ", 5, true
	Building(String name, int noOfRooms , boolean isSmartHome){
		this(noOfRooms, name);  //this(5,suraj) --> surajBuilding(5,suraj)
		this.isSmartHome = isSmartHome;  //surajBuilding.isSmartHome = true;
	
//		this.noOfRooms = noOfRooms; //surajBuilding.noOfRooms = 5
//		this.ownerName = name;
	}

	Building(int noOfRooms){
		this.noOfRooms = noOfRooms; //achalBuilding.noOfRooms = 5
	}


	Building(String name){
		this.ownerName = name;  //surajBuilding.name = suraj
	}
	Building(int noOfRooms,String name ){  //5, suraj
		//this(noOfRooms);  //call to other cons in same cls should be the 1st line
		this(name);  //surajBuilding(suraj);
		this.noOfRooms = noOfRooms;   
		
		//surajBuilding.name = suraj
		////surajBuilding.noOfRooms = 5

	}
	void displayOwnerDetails() {
		System.out.println("i am an owner");
	}

	static void displayBuilderName() {
		System.out.println(builderName);
	}

	void displayBuildingDetails() {
		System.out.println(builderName+ " "+ noOfRooms +" "+ isSmartHome+ " "+ ownerName);
	}
	public static void main(String args[]) {

		Building owner1 = new Building();
		//dc --> jvm --> def val , called auto by jvm

		Building owner2 = new Building("akshatha", 3 , false);
		////dc --> jvm --> def val , called auto by jvm


		Building surajBuilding = new Building("SURAJ", 5, true);
//		surajBuilding.noOfRooms = 10;

		Building achalBuilding = new Building(5);

		Building nousheenBuilding = new Building(4, "nousheen");

		owner1.displayBuildingDetails();
		owner2.displayBuildingDetails();
		surajBuilding.displayBuildingDetails();
		achalBuilding.displayBuildingDetails();
		nousheenBuilding.displayBuildingDetails();

	}
}
