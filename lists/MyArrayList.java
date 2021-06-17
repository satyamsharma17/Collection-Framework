package lists;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class MyArrayList {

	public static void main(String[] args) {
		
		List<String> fruits = new LinkedList<>();
	  	List<String> vegetables = new ArrayList();
		 
		fruits.add("Apple");
		fruits.add("Banana");
		fruits.add("Orange");
		
		for(String e: fruits) {
			System.out.println(e);
		}
		
		List<String> toRemove = new ArrayList();
		toRemove.add("Apple");
		toRemove.add("Banana");
		
		fruits.removeAll(toRemove);
		
		vegetables.add("Potato");
		vegetables.add("Tomato");
		vegetables.add("Onion");
		
		fruits.addAll(vegetables);
		
		System.out.println(fruits.size());
		
		System.out.println(fruits.contains("Guava"));
		
		System.out.println(fruits.contains("Apple"));
		
		System.out.println(fruits.isEmpty());
		
		String temp[] = new String[fruits.size()];
		
		fruits.toArray(temp);
		
		for(String e: temp) {
			System.out.println(e);
		}
		
		fruits.set(1, "Grapes");
		
//		fruits.remove(2);
		
//		fruits.clear();
		
		System.out.println(fruits.get(2));
		System.out.println(fruits);
		
		ArrayList<Integer> marks = new ArrayList();
		 
		Double x = 45.0;
		
		Pair<String, Integer> p1 = new Pair("Satyam", 457);
		Pair<Boolean, String> p2 = new Pair(true, "Hello");	
	
		p1.getDescription();
		p2.getDescription();
	}
}
