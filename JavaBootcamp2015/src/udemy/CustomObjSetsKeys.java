package udemy;

import java.util.LinkedHashMap;
import java.util.Map;
class Person {
	
}
public class CustomObjSetsKeys {

	public static void main(String[] args) {

		Map<String, Integer> map = new LinkedHashMap<String, Integer>();
		map.put("one", 1);
		map.put("two", 2);
		map.put("three", 3);
		map.put("one", 1);
		
		for (String key : map.keySet()) {
			System.out.println(key + ": " + map.get(key));
			
		}
			
	}

}
