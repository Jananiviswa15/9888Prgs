package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class HashSetEg {

	public static void main(String args[]) {
		
		HashSet<String> hashSet = new HashSet();
		HashSet<String> hashSet1 = new HashSet();
		
		ArrayList<String> arrList = new ArrayList<String>();
		arrList.add("aachal");
		arrList.add("divya");
		
		ArrayList<String> arrList1 = new ArrayList<String>();
		arrList1.add("aachal1");
		arrList1.add("aachal2");
		arrList1.add("aachal");
		arrList1.add("aachal");
		arrList1.add("aachal");
		arrList1.add("aachal");
		
		hashSet.addAll(arrList);
		hashSet.addAll(arrList1);
		
		hashSet.add("megha");
		hashSet.add("shradha");
		//System.out.println(hashSet);
//		System.out.println(hashSet.size());
//		System.out.println(hashSet.contains("divya"));
//		System.out.println(hashSet.isEmpty());
//		hashSet.clear();
		
		hashSet.remove("divya");
		arrList1.add("divya");
		arrList1.add("divya");
		
		System.out.println(arrList1);
		arrList1.removeIf(name -> name.contains("divya"));
		//System.out.println(arrList1);
		
		hashSet1.add("shradha");
		hashSet1.add("aachal2");
		hashSet1.add("aachal3");
		System.out.println("========");
		System.out.println(hashSet);
		System.out.println(hashSet1);
//	hashSet.addAll(hashSet1); //union
		
		hashSet.removeAll(hashSet1);
		hashSet1.retainAll(hashSet);
	System.out.println(hashSet);
		
	}
}
