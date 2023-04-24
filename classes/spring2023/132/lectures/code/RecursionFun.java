import java.util.LinkedList;

public class Recursionfun {

	
	public static String star_string(String s) {
		
		
		if(s.length() == 1) {
			return s;
		}
		
		else {
			
			if(s.charAt(0) == s.charAt(1)) {
				return s.charAt(0) + "*" + star_string(s.substring(1));
			}
			else {
				return s.charAt(0) + star_string(s.substring(1));
			}
			
		}
		
		
	}
	
	
	public static void print_LL(LinkedList<String> ll) {
		
		if(ll.size() == 1) {
			System.out.println(ll.getFirst());
		}
		else {
			
			System.out.println(ll.removeFirst());
			print_LL(ll);
		}
		
	}
	
	
	public static void print_LL_reverse(LinkedList<String> ll) {
		if(ll.size() == 1) {
			System.out.println(ll.getFirst());
			return;
		}
		else {
			
			String removed = ll.removeFirst();
			print_LL_reverse(ll);
			System.out.println(removed);
			return;
		}
		
	}
	
	public static void main(String[] args) {
		
		
		String ans = star_string("aabbcc");
		System.out.println(ans);
		
		LinkedList<String> ll = new LinkedList<String>();
		ll.add("First");
		ll.add("Second");
		ll.add("Third");
		ll.add("Fourth");
		
		//print_LL(ll);
		System.out.println();
		print_LL_reverse(ll);
		
	}

}
