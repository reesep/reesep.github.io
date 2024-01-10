
public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		
		DoublyLinkedList ll = new DoublyLinkedList();
		
		ll.fillLinkedList("airports.txt");
		
		ll.insert(new Node("BIL","Billings"), 3);
		
		//ll.printReverse();
		
		
		
		ll.printLinkedList();
		
		System.out.println();
		
		ll.removeSpot(4);
		
		//ll.remove("MIN");
		
		ll.printLinkedList();
		

	}

}
