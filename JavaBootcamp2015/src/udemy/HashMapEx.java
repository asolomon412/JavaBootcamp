package udemy;

import java.util.HashMap;

public class HashMapEx {

	public static void main(String[] args) {
		HashMap<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(5, "Five");
		map.put(7, "Seven");
		map.put(8, "Eight");
		map.put(4, "Four");
		
		map.get(6);
	}

}
