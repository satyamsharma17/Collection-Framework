package vectorsAndStacks;

//import java.util.Stack;
//import java.util.Vector;

public class MainClass {

	public static void main(String[] args) throws Exception {

//		Vector<Integer> v = new Vector<Integer>();
		
//		v.add(34);
//		v.add(12);

		MyStack<Integer> stack = new MyStack<Integer>();
		
//		stack.push(12);
//		stack.push(54);
//		stack.push(98);
		
		int popped = stack.pop();
		
		System.out.println(popped);

//This line of code will pop an element that we had put at last.	
//		popped = stack.pop();
		
//		popped = stack.pop();
		
//This line of code will throw a java.util.EmptyStackException because we try top pop an element from an empty stack.	
//		popped = stack.pop();
		
		int peeked = stack.peek(); 
		
//		System.out.println(popped);
	
		System.out.println(peeked);
	}

}
