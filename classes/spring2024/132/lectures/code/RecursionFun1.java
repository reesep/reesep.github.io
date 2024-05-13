import java.util.LinkedList;

public class RecursionFun1 {

	public static void main(String[] args) {
		
		//get the "current" time
		long start_time = System.nanoTime();
		System.out.println(fib(5));
		//get the "current" time
		long end_time = System.nanoTime();
		double elapsed_time = (end_time - start_time) / 1000000000.0;
		System.out.println(elapsed_time);
		
		System.out.println(countX("axxaxax"));
		System.out.println(star_string("aaaaaaaabbcc"));
		System.out.println(star_string("abcd"));
		
		LinkedList<String> words = new LinkedList<String>();
		words.add("First");
		words.add("Second");
		words.add("Third");
		words.add("Fourth");
		
		//printLinkedList(words);
		
		printLinkedListReverse(words);
		
		System.out.println(isPal("RACECAR"));
		
	}
	
	public static int fib(int n) {
		
		if(n == 1 || n == 2) {
			return 1; //base case
		}
		
		else {
			return fib(n-1) + fib(n-2); //recursive case
		}
		
	}
	
	public static int countX(String s) {
		s = s.toUpperCase();
		//base case
		if(s.length() == 0 ) {
			return 0;
		}
		else {
			if(s.charAt(0) == 'X') {
				return 1 + countX(s.substring(1)); //recursive case
			}
			else {
				return 0 + countX(s.substring(1)); //recursive case
			}
		}
		
	}
	
	public static String star_string(String str) {
		
		//base case
		if(str.length() == 1) {
			return str;
		}
		//recursive
		else {
			if(str.charAt(0) == str.charAt(1)) {
				return str.charAt(0) + "*"  + star_string(str.substring(1));
			}
			else {
				return str.charAt(0)  + star_string(str.substring(1));
			}
		}
		
	}
	
	public static void printLinkedList(LinkedList<String> ll) {
		
		//base case
		if(ll.size() == 1) {
			System.out.println(ll.getFirst());
		}
		
		//recursive case
		else {
			
			String removed = ll.removeFirst();
			System.out.println(removed);
			printLinkedList(ll);
			
		}
		
	}
	
public static void printLinkedListReverse(LinkedList<String> ll) {
		
		//base case
		if(ll.size() == 1) {
			
			System.out.println(ll.getFirst());
		}
		
		//recursive case
		else {
			
			String removed = ll.removeFirst(); //save value
			printLinkedListReverse(ll);
			
			System.out.println(removed);
			ll.add(removed);
			
			
		}
		
	}
	

	public static boolean isPal(String s) {
		
		//base case
		if(s.length() == 0 || s.length() == 1) {
			return true;
		}
		//recursive case
		else {
			
			if(s.charAt(0) == s.charAt(s.length() - 1)) {
				return isPal(s.substring(1,s.length()-1));
			}
			else {
				return false;
			}
			
			
		}
		
		
	}

}




