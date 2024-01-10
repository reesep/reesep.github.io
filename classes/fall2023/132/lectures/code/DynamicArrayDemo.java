
public class DynamicArrayDemo {

	public static void main(String[] args) {
		
		DynamicArray array = new DynamicArray();
		array.add("Reese");
		array.add("Susan");
		array.add("Spencer");
		array.print();
		//array.add("Larry");
		//array.print();
		//System.out.println(array.get(3));
		//System.out.println(array.find("Sarah"));
		array.remove("Susan");
		array.remove("Reese");
		array.remove("Nikki");
		array.print();
	}

}
