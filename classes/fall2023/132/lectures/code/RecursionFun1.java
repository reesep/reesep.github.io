import java.util.LinkedList;

public class RecursionFun1 {

	public static int factorial(int n) {
		//base case
		if(n == 0) {
			return 1;
		}
		
		//recursive
		else {
			return n * factorial(n-1);
		}
		
	}
	
	
	public static int fib(int n) {
		//base case
		if(n == 1 | n == 2) {
			return 1;
		}
		
		//recursive case
		else {
			return fib(n-1) + fib(n-2);
		}
	}
	
	public static int countX(String s) {
		
		//base case
		if(s.length() == 0) {
			return 0;
		}
		
		if(s.charAt(0) == 'x') {
			//"csci132" --> substring(1) --> "sci132"
			return 1 + countX(s.substring(1));
		}
		else {
			return 0 + countX(s.substring(1));
		}
		
	}
	
	public static String star_string(String str) {
		
		//base case
		if(str.length() == 1) {
			return str;
		}
		//recursive case
		if(str.charAt(0) == str.charAt(1)) {
			return str.charAt(0) + "*" + star_string(str.substring(1));
		}
		else {
			return str.charAt(0) + star_string(str.substring(1));
		}
	}
	
	public static void print_ll_recursive(LinkedList<String> ll) {
		
		//base case
		if(ll.size() == 1) {
			System.out.println(ll.getFirst());
		}
		else {
			System.out.println(ll.removeFirst());
			print_ll_recursive(ll);
		}
		
		
	}
	
	public static void print_ll_reverse(LinkedList<String> ll) {
		
		//base case
		if(ll.size() == 1) {
			System.out.println(ll.getFirst());
		}
		//recursive case
		else {
			String removed = ll.removeFirst();
			print_ll_reverse(ll);
			System.out.println(removed);
		}
	}
	
	public static void main(String[] args) {
		
		String s = "aaaaaaaaaa";
		String answer = star_string(s);
		System.out.println(answer);
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("first");
		ll.add("second");
		ll.add("third");
		ll.add("fourth");
		print_ll_reverse(ll);
		//print_ll_recursive(ll);
		
		
		/*
		//int answer = factorial(5); //5! = 5 * 4 * 3 * 2 * 1
		//System.out.println(answer);
		
		//Starting the "stopwatch"		
		long start_time = System.nanoTime();
		
		//let algorithm run
		int answer = fib(46);
		
		long end_time = System.nanoTime();
		
		double elapsed_time = (end_time - start_time) / 1000000000.0;
		System.out.println("Time: " + elapsed_time);
		
		System.out.println(answer);
		*/
		
	}

}
