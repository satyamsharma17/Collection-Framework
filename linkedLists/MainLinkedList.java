package linkedLists;

import java.util.*;

public class MainLinkedList {

	public static void main(String[] args) {
		
//		List<Integer> ll = new LinkedList<>();
		
//		List<Integer> al = new ArrayList<>();
		
//		getTimeDiff(al);
//		getTimeDiff(ll);
		
//		ll.add(12);
//		ll.add(1);
//		ll.add(2);
		
//		ll.set(2, 13);
		
//		ll.toArray();

//		System.out.println(ll.get(1));
//	}
	
//	static void getTimeDiff(List<Integer> list) {
		
//		long start = System.currentTimeMillis();
		
//		for(int i = 0; i<100000; i++) {
//			list.add(0, i);
//		}
		
//		long end = System.currentTimeMillis();
		
//		System.out.println(list.getClass().getName() + " ---> " +(end - start));
		
//MyLinkedList Implementation
	
	MyLinkedList<String> myLL = new MyLinkedList();
	
//		myLL.add(12);
//		myLL.add(56);
		
		for(int i = 0; i<20; i++) {
			myLL.add(i + " added");
		}
	
		myLL.print();
	}
	
}
