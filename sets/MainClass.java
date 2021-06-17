package sets;

import java.util.*;

public class MainClass {

	public static void main(String[] args) {
	
		Set<Integer> x = new HashSet<>();
		x.add(23);
		x.add(6);
		x.add(62);
		
		Set<Integer> y = new HashSet<>();
//		y.add(3);
		y.add(6);
		y.add(5);
		
//		x.addAll(y);
//		x.retainAll(y);
		
		System.out.println(x.containsAll(y));
		
		System.out.println(x);
		
//      Set<String> fruits = new TreeSet<>();
		
//		fruits.add("Mango");
//		fruits.add("Apple");
//		fruits.add("Guava");
		
//		Set<String> fruits = new LinkedHashSet<>();
		
//		fruits.add("Mango");
//		fruits.add("Apple");
//		fruits.add("Guava");
		
//		Set<String> fruits = new HashSet<>();
		
//		fruits.add("Mango");
//		fruits.add("Apple");
//		fruits.add("Guava");
//		System.out.println(fruits.add("Kiwi"));
		
//		System.out.println(fruits.add("Mango"));
		
//		System.out.println(fruits);
	}

}
