package Collections;

import java.util.HashSet;
import java.util.LinkedHashSet;

public class LinkedHashSetEG {
public static void main(String args[]) {
		
		LinkedHashSet<Integer> hashSet = new LinkedHashSet();
		hashSet.add(1);
		hashSet.add(1);
		hashSet.add(11);
		hashSet.add(12);
		hashSet.add(13);
		System.out.println(hashSet);
}
}