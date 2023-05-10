
public class SecondProgram {
	//datatypes
	//1. Primitve dt 2.non primitive dt
	
	//byte //2 bytes --> 16bits, -128 to 127
	public static void main(String args[]) {
	byte value = 27;  //var definition / intial
	byte value1 = -12; //var decla
	//store a valu, memo is alloc --> var
	//created a variable --> name - value , type -> byte, value -> 27
	
		System.out.println(value);
		System.out.println(value1);
		
		long humanAge = 200;
		//short 2bytes //-32768 to 32767
		
		short range = -323;
		short height = 177;
		
		//int 4bytes 
		int salary = 120000;
		
		//long 8bytes 
		long worldPopulation = 3938399839898L;
		
		System.out.println(range);
		System.out.println(height);
		System.out.println(salary);
		System.out.println(worldPopulation);
		
		
		float weight = 64.454f; //6 to 7 deciml deg  //4bytes
		double salary1 = 67000.8967895438989d; //8 bytes // more than 10deciml  //precise data
		
		char  charValue = 67;//0 to 255
		char  charValue1 = '0';//unicode system , 2bytes
		
		boolean isSleeping = true; // 1bit
		System.out.println("------------------");
		System.out.println(salary + salary1);
		System.out.println(weight - salary1);
		System.out.println(24.0/6);
		//24/6 -- > int 
		
		System.out.println(4*3);
		System.out.println(12.5 % 6);  //reminder  -- 0
		//13 % 6 --> 1
	}
	

}
