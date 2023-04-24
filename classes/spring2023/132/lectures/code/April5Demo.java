
import java.util.Stack;

import java.util.LinkedList;

import java.util.PriorityQueue;

public class April5Demo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Stack<String> stack = new Stack<String>();
		stack.push("4");
		stack.push("10");
		stack.pop();
		String s = stack.pop();
		System.out.println(s);
		
		//for(String each: stack) {
			//System.out.println(each);
		//}
		
		LinkedList<String> queue = new LinkedList<String>();
		
		queue.add("Hi");
		queue.add("Hello");
		queue.add("Yo");
		queue.remove();
		String s2 = queue.remove();
		System.out.println(s2);
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("EEEEE");
		pq.add("AAAAA");
		pq.add("ZZZZZ");
		pq.add("BBBBB");
		pq.remove();
		pq.remove();
		pq.remove();
		String s3 = pq.remove();
		System.out.println(s3);
		
		
	}

}
