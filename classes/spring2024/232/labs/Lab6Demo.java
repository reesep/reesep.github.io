
public class Lab6Demo {

	// You should not modify anything in this class.
	public static void main(String[] args) {
		
		
		HashTable table = new HashTable(50); //size of array = 50
		
		System.out.println("Inserting Initial Values");
		table.insert(450);
		table.insert(672);
		table.insert(40);
		table.insert(200);
		table.insert(90);
		table.insert(799);
		table.insert(249);
		
		table.printHashTable();
		
		System.out.println();
		System.out.println("Inserting 30 random Values");
		table.insertRandomValues(30);
		
		
		table.printHashTable();
		
		System.out.println();
		System.out.println("Collision Frequencies:");
		table.printCollisionTable();
	
		System.out.println();
		System.out.println("90 is located at index " + table.get(90));
		System.out.println("55555 is located at index " + table.get(55555));
		
	}

}
