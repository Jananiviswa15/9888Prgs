import java.util.Arrays;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.stream.Collector;
import java.util.stream.Collectors;

public class ApiInterviewQuest {

	public static void main(String arsg[]) {
		//
		//int num[] = {90,91,12,13,14,12,16,545,34,23,899};
		List<Integer> myNumList = Arrays.asList(90,90,12,13,14,12,16,1545,34,23,899);
//		List<String> myList = myNumList.stream().map(elem -> elem +"").filter(elem -> elem.startsWith("1")).limit(2).collect(Collectors.toList());
//		System.out.println(myList);
	//	myNumList.stream().map(elem -> elem +"").filter(elem -> elem.startsWith("1")). myNumList.stream().;
		
//		HashSet<Integer> mySet = new HashSet<Integer>();
//		List<Integer> myList = myNumList.stream().filter(elem -> !mySet.add(elem)).collect(Collectors.toList());
//		System.out.println(myList);
		// myNumList.stream().findFirst().ifPresent(System.out::println);
		//myNumList.stream().sorted(Collections.reverseOrder()).forEach(System.out::println);
	
		
		List<String> nameList = Arrays.asList("hi","hello", "all");
		nameList.stream().map(elem -> elem.toUpperCase()).forEach(System.out::print);
		
		String name = "ahsanullah";
		//hi --> h i 
		//ahsanullah
//a,h,s,a,n,u,l,l,a,h
		//a h s a 
		System.out.print(name.chars().mapToObj(everyChar ->(char) everyChar+" ").collect(Collectors.joining()).stripTrailing());
		System.out.println(5);
}
}