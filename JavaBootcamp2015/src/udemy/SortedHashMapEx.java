package udemy;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class SortedHashMapEx {

	public static void main(String[] args) {
		// HashMap returns keys in no particular order
		HashMap<Integer, String> hashMap = new HashMap<Integer, String>();
		// LinkedHashMap returns keys in the order you put them in
		LinkedHashMap<Integer, String> linkedHashMap = new LinkedHashMap<Integer, String>();
		// TreeMap returns keys in a natural order
		TreeMap<Integer, String> treeMap = new TreeMap<Integer, String>();

		testMap(hashMap);
		System.out.println();
		testMap(linkedHashMap);
		System.out.println();
		testMap(treeMap);
	}

	public static void testMap(Map<Integer, String> map) {
		map.put(9, "fox");
		map.put(4, "cat");
		map.put(8, "dog");
		map.put(1, "giraffe");
		map.put(0, "swan");
		map.put(15, "bear");
		map.put(6, "snake");

		for (Integer key : map.keySet()) {
			String value = map.get(key);

			System.out.println(key + ": " + value);
		}
	}
}
