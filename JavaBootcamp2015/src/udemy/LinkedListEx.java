package udemy;

import java.util.List;
import java.util.ArrayList;
import java.util.LinkedList;

public class LinkedListEx {

	public static void main(String[] args) {
		List<Integer> arrayList = new ArrayList<Integer>();
		List<Integer> linkedList = new LinkedList<Integer>();

		doTimings("ArrayList", arrayList);
		doTimings("LinkedList", linkedList);
	}

	private static void doTimings(String type, List<Integer> list) {
		for (int i = 0; i < 1E5; i++) {
			list.add(i);

		}
		long start = System.currentTimeMillis();
		// Adding items to the end of the list
		// for (int i = 0; i < 1E5; i++) {
		// list.add(i);
		// }

		for (int i = 0; i < 1E5; i++) {
			list.add(0, i);
		}
		long end = System.currentTimeMillis();

		System.out.println("Time taken: " + (end - start) + " ms for " + type);
	}
}
