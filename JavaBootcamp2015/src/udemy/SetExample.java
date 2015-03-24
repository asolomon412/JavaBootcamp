package udemy;

import java.util.HashSet;
import java.util.Set;
import java.util.TreeSet;

public class SetExample {

	public static void main(String[] args) {
		// HashSet does not retain any kind of order
		// Set<String> set1 = new HashSet<String>();

		// LinkedHasSet remembers the order you put things in
		// Set<String> set1 = new LinkedHashSet<String>();

		// TreeSet sorts in natural order
		Set<String> set1 = new TreeSet<String>();

		if (set1.isEmpty()) {
			System.out.println("Set is empty at start\n");
		}

		set1.add("dog");
		set1.add("cat");
		set1.add("mouse");
		set1.add("rabbit");
		set1.add("pig");

		if (set1.isEmpty()) {
			System.out.println("Set is empty at end -- this will not happen");
		}

		// Adding duplicate items does nothing
		set1.add("mouse");

		System.out.println(set1);
		System.out.println();

		// Iteration
		for (String element : set1) {
			System.out.println(element);
		}

		// Does set contain a given item?
		if (set1.contains("aardvark")) {
			System.out.println("Contains aardvark");
		}

		if (set1.contains("cat")) {
			System.out.println("Contains cat\n");
		}

		// set2 contains some common elements with set 1 and some new
		Set<String> set2 = new TreeSet<String>();

		set2.add("cat");
		set2.add("dog");
		set2.add("horse");
		set2.add("bird");
		set2.add("turkey");

		// Intersection
		Set<String> intersection = new HashSet<String>(set1);
		intersection.retainAll(set2);
		System.out.println(intersection);

		// Difference
		Set<String> difference = new HashSet<String>(set1);
		difference.removeAll(set2);
		System.out.println(difference);
	}

}
