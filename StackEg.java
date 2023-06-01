package Collections;

import java.util.Stack;

public class StackEg {

	public static void main(String args[]) {
		
		Stack<String> stackList = new Stack();

		Stack<String> stackList1 = new Stack();
		stackList1.add("janani");
		stackList1.add("divya");
	stackList.add("janani");
	stackList.add("divya");
	
	stackList.add(1, "minal");
	stackList.add(1, "suraj");
	//stackList.addAll(stackList1);
	stackList.addAll(3,stackList1);
	System.out.println(stackList);
	
//	System.out.println(stackList.isEmpty());
//	System.out.println(stackList.size());
//	stackList.clear();
	System.out.println(stackList.contains("minal"));
	System.out.println(stackList.search("suraj"));
	System.out.println(stackList.peek());
	System.out.println(stackList);
	System.out.println(stackList.pop());
	System.out.println(stackList);
//	stackList.remove(1);
//	stackList.remove("minal");
//	stackList.removeAll(stackList1);
	stackList.get(1);
	stackList.indexOf("minal");
	Object[] arr = stackList.toArray();
	stackList.lastIndexOf("divya");
	}
}
