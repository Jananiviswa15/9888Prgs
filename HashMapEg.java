package Collections;

import java.io.ObjectInputStream.GetField;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map.Entry;

public class HashMapEg {
//one null key
	public static void main(String args[]) {
		HashMap< Integer, String> map = new HashMap<Integer, String>();
		map.put(12, "janani");
		map.put(12, "janani"); //dup key
		map.put(2, "janani"); //dup val
		map.put(1, "minal");
		map.put(10, "tejas");
		map.put(41, "pratiksha");
		
		System.out.println(map);
		System.out.println(map.keySet());
		System.out.println(map.values());
		System.out.println(map.containsKey(2));
		System.out.println(map.containsValue("janani"));
		System.out.println(map.entrySet());
		map.putIfAbsent(11, "hello");
		
		System.out.println(map.get(12));
//		System.out.println(map.isEmpty());
//		map.clear();
//		System.out.println(map.size());
//		System.out.println(map.remove(12));
//		System.out.println(map.remove(12, "janani"));
		
		System.out.println(map.replace(12, "you"));
		System.out.println(map.replace(1,"minal" , "new val"));
//map.replaceAll((key, value) -> value.toLowerCase("this value"));
		
		LinkedHashMap<Integer, String> mapEg = new LinkedHashMap<Integer, String>();
		mapEg.put(12, "janani");
		mapEg.put(12, "janani"); //dup key
		mapEg.put(2, "janani"); //dup val
		mapEg.put(1, "minal");
		mapEg.put(10, "tejas");
		mapEg.put(41, "pratiksha");
		System.out.println(mapEg);
		System.out.println(map); //hashmap
	map.putAll(mapEg);
	}
}
