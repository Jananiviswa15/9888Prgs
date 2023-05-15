
public class ArrayEg {
	
	static void toVisualiseArrayInDetail(char arr[]) {
		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);
		System.out.println(arr.length);   //size of any arr
		System.out.println(arr);  //arra  nem contains base adrs --> the value
		
		System.out.println("the adrs "+arr);
		System.out.println(arr.getClass().getName());
	}
//arr --> lot of val , same dt , cont memm, 
	//arr name --> base adrs
	//index from 0 
	/*
	 * dt varName
	 * array decl:
	 * dt[] arrName;
	 * dt []arrName;
	 * dt arrName[];
	 */
	public static void main(String anything[]) {
	boolean array[] = new boolean[3];//false, false, false
	array[2] = true; ////false, false, true
	int arr1[]; //arr decl
	int arr[] = new int[10];  //4*10 = 40bytes
	byte byteArr[] = new byte[3];
	short shortArr[] = new short[3];
	long longArr[] = new long[3];
	float floatArr[] = new float[3];
	double doubleArr[] = new double[3];
	char charArr[] = new char[3];
	charArr[0] = 'a';
	charArr[1] = '1';
	charArr[2] = 'c';
	//toVisualiseArrayInDetail(charArr);
/*	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	System.out.println(arr[5]);
	System.out.println(arr[6]);
	System.out.println(arr[7]);
	System.out.println(arr[8]);
	System.out.println(arr[9]);*/
	arr[0] = 100;
	arr[1] = 90;
	arr[8] = -9;
	arr[2] = 1000000;
	
	//System.out.println(arr);
	//System.out.println(array);
	
/*	System.out.println(arr[0]);
	System.out.println(arr[1]);
	System.out.println(arr[2]);
	System.out.println(arr[3]);
	System.out.println(arr[4]);
	System.out.println(arr[5]);
	System.out.println(arr[6]);
	System.out.println(arr[7]);
	System.out.println(arr[8]);
	System.out.println(arr[9]);*/
	
	int arrayValue[] = {78, 89, 90, 67};  //arr def
	}
	
}
