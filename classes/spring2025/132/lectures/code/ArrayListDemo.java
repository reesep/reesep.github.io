import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<String>();
		
		array.add("First");
		array.add("Second");
		
		array.add("Third");
		System.out.println(array);
		System.out.println(array.get(2));
		array.remove("First");
		System.out.println(array);
		for(String s: array) {
			System.out.println(s);
		}
	}

}
