
public class DynamicArrayDemo {

	public static void main(String[] args) {
		
		
		DynamicArray array = new DynamicArray();
		array.add("Reese");
		array.add("Susan");
		array.add("Spencer");
		
		System.out.println(array.get(10));
		
		array.print();
		
		System.out.println(array.find("aslfkhasflkahsfa"));
		
		array.remove("asdsadsad");
		
		array.print();
		
	}

}
