
public class DebugMe {

	public static void main(String[] args) {
		
		Person[] array = new Person[5];
		
		Person p = null;
		
		array[0] = new Person("Reese", 31);
		array[1] = new Person("Susan", 44);
		array[2] = new Person("Parker", 16);
		array[3] = new Person("Meatball", 5);
		
		for(int i = 0; i < array.length; i++) {
			System.out.println(array[i].getName());
		}
		
		

	}

}
