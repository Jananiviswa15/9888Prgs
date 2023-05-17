package checkDefault;

public class String2 {
public static void main(String args[]) {
	
	String name = "janani"; //scp  name , name1--> janani
	String nameObj = new String("janani");  //heap are
	
	String name1 = nameObj.intern();
	System.out.println(name == name1);
	
	
	
	//str --> char[]
String companyName = "EDUBRIDGE";
	char companyNameArr[] = new char[10] ;
	companyName.getChars(0, 4, companyNameArr, 2);
	System.out.println(companyNameArr);
	System.out.println(companyNameArr.length);
	
	

	String learner1 = "AJAY";
	String learner2 = learner1.toUpperCase();
	String learner3  = "AJAY";
	System.out.println(learner1 == learner3);
	
	
}
}
