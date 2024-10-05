import java.util.ArrayList;

public class ArrayListDemo {

	public static void main(String[] args) {
		
		ArrayList<String> array = new ArrayList<>();

		array.add("Jack");
		array.add("Reese");
		array.add("Sally");
		
		System.out.println(array);
		
		array.remove("Sally");
		
		System.out.println(array);
		
	}

}
