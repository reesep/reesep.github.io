
public class Lab6Demo {

	public static void main(String[] args) {
		
		CircularLinkedList locations = new CircularLinkedList("locations.txt");
		
		
		System.out.println("The Great Circle Locations");
		System.out.println("-----------------------------");
		locations.printLinkedList();
		
		System.out.println();
		
		locations.search("Egypt Pyramids");
		locations.search("Bozeman");
		
		System.out.println();
		
		locations.findGreatestElevationDifference();
		

	}

}
