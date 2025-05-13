
public class DoublyLinkedListDemo {

	public static void main(String[] args) {
		
		DoublyLinkedList dll = new DoublyLinkedList("airports.txt");

		dll.print();
		System.out.println();
		
		dll.insert( new Node("PHX" ," Phoenix"), 3);
		dll.print();
		
		//dll.printReverse();
		System.out.println();
		dll.remove("ORD");
		dll.print();
		
	}

}
