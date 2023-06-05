package Collections;

import java.util.Map;
import java.util.TreeMap;

public class MapEg {
//map -->> key and vakue pari 
	//key cant be dup 
	//val can be dup
	public static void main(String args[]) {
		//tree set / tree mp --> RB 
		//key cant be null
		
		TreeMap<Integer, String> studentEntry = new TreeMap<Integer, String>();
		studentEntry.put(12, "janani");
		studentEntry.put(12, "janani"); //dup key
		studentEntry.put(2, "janani"); //dup val
		studentEntry.put(1, "minal");
		studentEntry.put(10, "tejas");
		studentEntry.put(41, "pratiksha");
		
//		for(int val : arr) {
//			
//		}
//		for(Map.Entry<Integer, String> map : studentEntry.entrySet()) {
//			System.out.println(map.getKey());
//			System.out.println(map.getValue());
//		}
//		
//		System.out.println(studentEntry.keySet());
//		System.out.println(studentEntry.values());
//		System.out.println(studentEntry);
		
//		System.out.println(studentEntry.remove(12));
//		System.out.println(studentEntry.remove(2, "janani"));
//		System.out.println(studentEntry.size());
//		System.out.println(studentEntry);
//		System.out.println(studentEntry.descendingKeySet());
//		System.out.println(studentEntry.descendingMap());
//		System.out.println(studentEntry.headMap(12, true));
//		System.out.println(studentEntry.tailMap(12));
//		System.out.println(studentEntry.subMap(2,true,12, true));
		
	//studentEntry.clear();
		System.out.println(studentEntry.firstEntry()); // kv 
		System.out.println(studentEntry.firstKey());
		System.out.println(studentEntry.floorKey(13));
		System.out.println(studentEntry.floorEntry(12));
		System.out.println(studentEntry.higherEntry(40));
		System.out.println(studentEntry.higherKey(40));
		System.out.println(studentEntry.pollFirstEntry());
		System.out.println(studentEntry.pollLastEntry());
		System.out.println(studentEntry.replace(12, "hi all"));
		System.out.println(studentEntry.replace(2, "janani", " good"));
		System.out.println(studentEntry.lastKey());
		System.out.println(studentEntry.lastEntry());
		System.out.println(studentEntry.get(2));
		
	}
}
