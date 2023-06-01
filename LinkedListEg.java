package Collections;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListEg {

	public static void main(String args[]) {
	LinkedList<String> list = new LinkedList<String>();
	list.add("janani");
	list.add("janani1");
	list.add("janani2");
	list.add("janani3");
	list.add(2,"hi");
	
	
	LinkedList<String> list1 = new LinkedList<String>();
	list1.add("sruthi");
	list1.add("sruthi");
	list1.add("sruthi");
	list1.add("sruthi");
	
	System.out.println(list.contains(list1));
	System.out.println(list.contains("sruthi"));
	
	//list.remove(); //remove first elem
//	list.removeFirst();
//	list.remove(1);
//	list.remove("hi");
	list.removeLast();
	list.removeFirstOccurrence("hi"); //1st occ of val
	list1.removeLastOccurrence("sruthi");
	
	list.set(2, "change val");
	list.get(2);
	list.getFirst();
	list.getLast();
	
//	list.addAll(list1);
//	list.addAll(2, list1);
	
//	System.out.println(list.size());
//	list.clear();
//	System.out.println(list.isEmpty());
	System.out.println(list1);
	
//	Iterator itr = list.iterator(); 
//	for(;itr.hasNext();) {
//		System.out.print(itr.next()+" ");
//	}
//	
//	for(String value : list)
//		System.out.print(value+" ");
//	}
	}
}
