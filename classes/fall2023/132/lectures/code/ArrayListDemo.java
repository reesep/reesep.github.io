
import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> myarray = new ArrayList<String>();
		
		myarray.add("Tony");
		myarray.add("Reese");
		myarray.add("Jake");
		
		System.out.println(myarray);
		
		System.out.println(myarray.get(2));
		
		myarray.remove(0);
		myarray.remove("Reese");
		
		System.out.println(myarray);
		myarray.remove(0);
		System.out.println(myarray.isEmpty());

	}

}
