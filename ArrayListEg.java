package Collections;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;

//always maintain insertion order
//arr[] = {89,78,45} //arr[6]
//dynamic arr
//shifting arr elem
//non sync
public class ArrayListEg {

	public static void main(String args[]) {
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("aachal");
		arrList.add("divya");
		System.out.println(arrList.isEmpty());
		
	
		arrList.add(1, "sruthi");
		arrList.add("sruthi");
		System.out.println(arrList.size());
		
		
		ArrayList<String> arrList1 = new ArrayList<String>();
		arrList1.add("aachal");
		arrList1.add("aachal");
		arrList1.add("aachal");
		arrList.addAll(arrList1); //end of arrlist arrlist1 has been added
//		arrList.remove(0);
//		arrList.remove("aachal");
		arrList.removeAll(arrList1);
		System.out.println(arrList);
		
		
//		Iterator itr = arrList.iterator(); 
//		for(;itr.hasNext();) {
//			System.out.print(itr.next()+" ");
//		}
		
		//for each
//		for(String value : arrList1)
//			System.out.print(value+" ");
//		arrList.addAll(1, arrList1);
//		arrList.clear();
//		System.out.println(arrList.isEmpty());
		
//		ArrayList<Integer> intList = new ArrayList<Integer>();
//		intList.add(89);
//		intList.add(89);
//		intList.add(89);
//		
//		ArrayList<Integer> intList1 = new ArrayList<Integer>();
//		intList1.add(90);
//		intList1.add(90);
//		intList1.add(90);
//		intList.addAll(1, intList1);
//		System.out.println(intList);
		
		
//		
//		System.out.println(arrList.set(0, "achal is sleeping"));
//		System.out.println(arrList.get(0));
//		Collections.sort(arrList);
//		System.out.println(arrList);
//		
	}
}
