
public class CopyArray {


	public static void main(String args[]) {

		int arr[] = {89,90, 8045, 34344,-3434};

		int copiedArr[] = new int[arr.length];

		copiedArr[0] = arr[0];
		copiedArr[1] = arr[1];
		copiedArr[2] = arr[2];
		copiedArr[3] = arr[3];
		copiedArr[4] = arr[4];


		int arrayCopy[] = arr.clone();

		//System.out.println(arr[0] == arrayCopy[0]);
		System.out.println(arrayCopy[2]);
		int array[] = new int[8];

		arr[0] = 90;
		arrayCopy[3] = 0;
		//== on PDT checks val 
		//on NPDT checks address
		System.out.println(arr);
		System.out.println(arrayCopy);	
		System.out.println(arr == arrayCopy);
		
		int multiDim[][] = {{78,89,90},
				{90,78,67},
				{78,90,23}};
		int copyMultiDim[][] = multiDim.clone();
		
		System.out.println(copyMultiDim[0][0]);
		
		System.out.println(multiDim);
		System.out.println(copyMultiDim);
		System.out.println(multiDim == copyMultiDim);
		
		System.out.println(multiDim[0]);
		System.out.println(copyMultiDim[0]);
		System.out.println(multiDim[0] == copyMultiDim[0]);
		
		
		multiDim[0][0] = 100;
		System.out.println(copyMultiDim[0][0]);
		
	}
}
