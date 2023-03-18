
public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		DoublyLinkedList dll = new DoublyLinkedList();
		
		dll.fillLinkedList("airports.txt");
		
		dll.insert( new Node("dasdsad","Asdasdas"), 0);
		
		dll.printLinkedList();
		
		
	}

}
