
public class CircularDoublyLinkedListDemo {

	public static void main(String[] args) {
		
		CircularDoublyLinkedList dll = new CircularDoublyLinkedList();
		dll.fillLinkedList();
		
		dll.insert(new Node("BIL", "Billings"), 3);
		dll.insert(new Node("SLC", "Salt Lake City"), 6);
		dll.printLinkedList();
		
		System.out.println();
		dll.printLinkedListReversed();
		
		
		System.out.println();
		dll.remove("ORD");
		dll.printLinkedList();
		
		System.out.println();
		dll.remove(3);
		dll.printLinkedList();
		
	}

}