
public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList();
		dll.fillLinkedList("airports.txt");

		Node newNode = new Node("BIL","Billings");
		dll.insert(newNode, 4);
		
		dll.print();
		//dll.printReverse();
		
		System.out.println();
		
		dll.remove("MSP");
		
		dll.print();
	}

}
