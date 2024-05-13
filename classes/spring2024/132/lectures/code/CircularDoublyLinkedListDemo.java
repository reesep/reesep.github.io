
public class CircularDoublyLinkedListDemo {

	public static void main(String[] args) {
		
		CircularDoublyLinkedList dll = new CircularDoublyLinkedList();
		dll.fillLinkedList("airports.txt");

		Node newNode = new Node("BIL","Billings");
		dll.insert(newNode, 4);
		
		dll.print();
		//dll.printReverse();
		
		System.out.println();
		
		dll.remove("XXX");
		
		dll.print();
	}

}
