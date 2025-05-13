
public class DynamicArrayDemo {

	public static void main(String[] args) {
		
		DynamicArray array = new DynamicArray();
		
		array.add("Reese");
		array.add("Susan");
		array.add("Jack");
		array.add("Clem");

		array.print();
		
		array.add("John");
		array.add("Jill");
		
		array.print();
		
		System.out.println(array.get(2));
		
	}

}
