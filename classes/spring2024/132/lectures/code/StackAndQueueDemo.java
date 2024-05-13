import java.util.Stack;
import java.util.LinkedList;
import java.util.Queue;
import java.util.PriorityQueue;

public class StackAndQueueDemo {

	public static void main(String[] args) {
		
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("AAA");
		stack.push("BBB");
		stack.push("CCC");
		
		System.out.println(stack.peek());
		System.out.println(stack.pop());
		System.out.println(stack.pop());
		
		Queue<String> queue = new LinkedList<String>();
		
		queue.add("XXX");
		queue.add("YYY");
		queue.add("ZZZ");
		
		System.out.println(queue.peek());
		System.out.println(queue.poll());
		System.out.println(queue.remove());
		
		PriorityQueue<Integer> pq = new PriorityQueue<Integer>();

		pq.add(40);
		pq.add(16);
		pq.add(100);
		pq.add(27);
		pq.add(61);
		
		System.out.println(pq.poll());
		System.out.println(pq.remove());
		System.out.println(pq.poll());
		
	}

}
