
public class ArrayEg1 {

	private static void toSeeMultidimensionArrayInDetail(int arr[][]) {
		System.out.println(arr.length);//no of rows
		System.out.println(arr[0].length); // 1st row no of col
		System.out.println(arr[1].length);
		System.out.println("base adrs"+arr);
		System.out.println(arr[0][0]);
		System.out.println(arr[1][0]);
		System.out.println(arr[2][0]);
		System.out.println("==========");
		System.out.println(arr.getClass().getName());
		System.out.println(arr.getClass().getSuperclass().getName());
	}
	public static void main(String args[]) {
		//multi dimensional array --> [][] r and  c, r is compulsory
		/* dt[][] arrName;
		 * dt [][]arrName;
		 * dt arrName[][];*/

		short pratikhsaMark[] = {45, 190, 78, 190, 200};
		int arr[][];

	
		arr = new int[3][4];   //12, cont mem, object, base adr, default val

		byte row = 20;
		byte col = 10;

		float array[][] = new float[row][col];  //200

		
		arr[0][0] = -10;
		arr[1][0] = -100;
		arr[2][0] = -1000;
		toSeeMultidimensionArrayInDetail(arr);

int arrayValue[][] = {{78,90,90}, //arr def
						{90,90,90}};

		//col number differ --> jagged array
		
short jaggedArray[][] = {{90,90},
						 {90,90,-90,-90,9},
						 {78,23,123}};

System.out.println(jaggedArray.length);
System.out.println(jaggedArray[1].length);
System.out.println(jaggedArray);


int jaggedArr[][] = new int[4][];//4 rows
jaggedArr[0] = new int[10];
jaggedArr[1] = new int[8];

//System.out.println(jaggedArr[5][0]); out of bound 
System.out.println(jaggedArr[0][0]);


	}
}


