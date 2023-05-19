package ConditionalPrg;
//switch 0nly val  case only val default(opt)
//wrapper cls, pdt , str, enum val pass as case val
//case no dup val
//no cond , no exp is allowed in case
//case in any order
//case with break / break
public class SwitchEg {

	public static void main(String args[]) {
		int dayOfWeek = 14;
		if(dayOfWeek >= 1 && dayOfWeek <= 7) {
			switch(dayOfWeek) {
			case 7+10: 

				System.out.println("mon");	
				System.out.println("case if it is mul lines also u dont need to g ive {}");
			case 7 : 
				System.out.println("sun");	

			case 3 : 
				System.out.println("wed");	

			case 4 : 
				System.out.println("thur");	
				break;  //it ll come of the switch
			case 2 : 
				break;
				//.out.println("tue");	

			case 5: 
				System.out.println("fri");	

			case 6 : 
				System.out.println("sat");	
			/*default : 
				System.out.println("give only positive val");*/
				//break;
			}
		}
	}
}
