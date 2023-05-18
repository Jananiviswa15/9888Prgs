enum Hobbies{
	SKATING,
	CHESS,
	FOOTBALL ; //public static final
	
	Hobbies() {
		System.out.println(" i am constr");		
	}
	
	public void sayHi() {
		System.out.println(" hi i am from method of enum");
	}
}
//enum cont methods, attr , constr
//inherited / extended

//enum in which main method

//enum wfo{
//main(){
//}
//}
public class EnumDataType {
	
	 enum WorkFromOffice{
		MONDAY,
		WEDNESDAY,
		FRIDAY;
		 
		 
		 WorkFromOffice(){
			 
		 }
	 }
	
	enum WorkFromHome{
		TUESDAY,
		THURSDAY
	}
	public static void main(String args[]) {
String name = "shruthi"; 
char charArray[] = name.toCharArray();
System.out.println(charArray[3]);

Hobbies myHobby = Hobbies.CHESS;
System.out.println(Hobbies.CHESS);
System.out.println(myHobby);


//valuesOf(), values(), ordinal

System.out.println(Hobbies.valueOf("SKATING"));
Hobbies myHobbiesArr[] = Hobbies.values();  //ll return all the enum const
System.out.println(myHobbiesArr[0]);
System.out.println(myHobbiesArr.length);

System.out.println(Hobbies.valueOf("SKATING").ordinal()); //index
//enum --> enumeration

myHobby.sayHi();
	}
}
