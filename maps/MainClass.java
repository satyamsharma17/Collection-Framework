package maps;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class MainClass {

	public static void main(String[] args) {
		
		Map<String, Integer> numbers = new HashMap<>();
		
//		numbers.put("one", 1);
//		numbers.put("two", 2);
//	 	numbers.put("three", 3);
		 
//		numbers.putIfAbsent("one", 10);
		
//		numbers.remove("two");
		
//		numbers.remove("three", 33);
		
//		System.out.println(numbers.keySet());
		
//		System.out.println(numbers.get("two"));
		
//		System.out.println(numbers.values());
		
//		System.out.println(numbers.entrySet());
		
//		System.out.println(numbers.get("five"));
		
//		System.out.println(numbers.containsKey("two"));
		
//		System.out.println(numbers.containsValue(3));
		
//		System.out.println(numbers);
		
//		Set<Entry<String, Integer>> entries = numbers.entrySet();
 		
//		for(Entry<String, Integer> entry: entries) {
//			entry.setValue(entry.getValue() * 100);
//		}
		
//		System.out.println(numbers);
		
		System.out.println(getHash("CAT"));
		
		System.out.println(getHash("DOG"));
		
		System.out.println(getHash("BALL"));
		
		System.out.println(getHash("GOD"));
	}
	
	public static int getHash(String s) {
		int hash = 0;
		for(int i = 0; i<s.length(); i++) {
			hash += s.charAt(i);
		}
		return hash;
	}

}
