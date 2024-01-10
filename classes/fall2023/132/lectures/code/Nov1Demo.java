import java.util.Stack;
import java.util.Queue;
import java.util.LinkedList;
import java.util.PriorityQueue;

public class Nov1Demo {

	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		stack.push("AAA");
		stack.push("BBB");
		stack.push("CCC");
		stack.pop();
		System.out.println(stack);
		
		//---------------
		
		Queue queue = new LinkedList<String>();
		queue.add("1");
		queue.add("2");
		queue.add("3");
		
		System.out.println(queue);
		
		queue.remove();
		System.out.println(queue);
		
		//-------------------//
		
		PriorityQueue<String> pq = new PriorityQueue<String>();
		
		pq.add("DDD");
		pq.add("AAA");
		pq.add("FFF");
		
		System.out.println(pq);
		

	}

}
