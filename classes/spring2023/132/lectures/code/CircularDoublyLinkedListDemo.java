
public class CircularDoublyLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		CircularDoublyLinkedList dll = new CircularDoublyLinkedList();
		
		dll.fillLinkedList("airports.txt");
		dll.printLinkedList();
		System.out.println();
		
		//insert new node in middle of CLL
		dll.insert( new Node("TestCode","Test"), 3);
		dll.printLinkedList();
		System.out.println();
		
		//removing head
		dll.remove("LAX");
		dll.printLinkedList();
		System.out.println();
		
		//removing something in middle
		dll.remove("ORD");
		dll.printLinkedList();
		System.out.println();
		
		//remove tail
		dll.remove("MIN");
		dll.printLinkedList();
		System.out.println();
		
	}

}
