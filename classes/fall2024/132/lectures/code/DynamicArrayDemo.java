
public class DynamicArrayDemo {

	public static void main(String[] args) {
		
		DynamicArray array = new DynamicArray();

		array.add("First");
		array.add("Second");
		array.add("Third");
	
		
		array.printArray();
		
		array.add("Fourth");
		array.add("Fifth");
		array.remove("Third");
		array.printArray();
		
		//System.out.println(array.find("third"));
		
		//System.out.println(array.get(4));
		
	}

}
