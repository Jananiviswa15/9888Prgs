package Collections;

import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;

public class QueueEg {

	public static void main(String args[]) {
		Deque<Integer> queue = new ArrayDeque<Integer>();
		queue.add(10);
		queue.add(10);
		queue.add(20);
		queue.add(30);
		
		
		//queue.clear();
		queue.addFirst(100);
		queue.addLast(1000);
		System.out.println(queue);
		
		//Iterator<Integer> itr = queue.iterator();
//		Iterator<Integer> itr = queue.descendingIterator();
//		for(; itr.hasNext(); )
//			System.out.println(itr.next());
//		
		System.out.println("----");
		System.out.println(queue.element());
		System.out.println(queue);
		System.out.println(queue.getFirst());
		System.out.println(queue);
		System.out.println(queue.getLast());
		System.out.println(queue.peek());
		System.out.println(queue.peekFirst());
		System.out.println(queue.peekLast());
		System.out.println(queue.remove(30));
		
		
		
		queue.offer(90);
		//offerFirst, offerLast
	}
}
