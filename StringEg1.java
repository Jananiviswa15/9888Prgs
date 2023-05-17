package checkDefault;

public class StringEg1 {

	public static void main(String args[]) {
		//seq char , 
		char arr[] = {'s', 'h', 'r', 'u','t','i'};
		//	System.out.println(arr);
		String learnerName = new String(arr);
		System.out.println(learnerName);


		String learner1 = "ajay";  //val ll enter into string const pool


		//l1, l2 ---> ajay      l4,learner3 -> AJAY
		String learner2 = "ajay";//string const pool is present in heap area

		String learner3 = "AJAY";
		String learner4 = "AJAY";

		System.out.println(learner1 == learner2);  //true
		System.out.println(learner3 == learner4);  //true

		System.out.println(learner1.equals(learner2));

		String learnerObj = new String("ajay");  //val ll nvr go to scp , it ll directly heap mem
		System.out.println(learner1 == learnerObj);
		String learnerObj1 = new String("ajay");
		System.out.println(learnerObj1 == learnerObj);

		//trying to upper case but the val is not chang --> str is immutable
		System.out.println(learner1.toUpperCase());  //AJAY
		System.out.println(learnerObj.toUpperCase());

		System.out.println(learner1 + " "+ learnerObj);
		//expclit assign the val  to str lit / str obj --> string is imm
		learner1 = learner1.toUpperCase();  //AJAY  //l1, l3, l4
		learnerObj = learnerObj.toUpperCase();
		System.out.println(learner1 + " "+ learnerObj);



		System.out.println(learner1.repeat(3));
		byte byteArr[] = learner1.getBytes();  //AJAY  //65 74 65 89
		System.out.println((char)byteArr[0]);
		System.out.println(byteArr[1]);
		System.out.println(byteArr[2]);
		System.out.println(byteArr[3]);
		System.out.println(learner1.substring(1));	 //ajay	
		System.out.println(learner1.substring(1,2));  //strt ind is inclu , end ind is exclu
		System.out.println(learner1.startsWith("a")); 
		System.out.println(learner1.compareTo("Chennai"));  //AJAY vs Chennai  //+ve, -ve , zero 
		System.out.println("Chennai".compareTo("Chennai"));
		System.out.println("Chennai".compareTo(learner1));
	}
}
