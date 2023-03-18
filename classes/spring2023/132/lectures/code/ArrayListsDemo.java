
import java.util.ArrayList;

public class ArrayListsDemo {

	public static void main(String args[]) {
		
		ArrayList<String> mylist = new ArrayList<String>();
	
		mylist.add("Jack");
		mylist.add("Sally");
			
		System.out.println(mylist.get(1));
		
		mylist.remove("Sally");
		mylist.remove(0);
		System.out.println(mylist);
		
	}
	
	
	
	
	
}
