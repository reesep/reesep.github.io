
public class SinglyLinkedList {

	private Node head;
	private int size;

	public SinglyLinkedList() {
		this.head = null;
		this.size = 0;
	}

	public void addToFront(Node newNode) {

		if (head == null) {
			head = newNode;
		} else {

			newNode.setNext(head);
			head = newNode;

		}
		size++;
	}

	public void addToBack(Node newNode) {

		if (head == null) {
			head = newNode;
		} else {

			Node current = head;
			while (current.getNext() != null) {
				current = current.getNext();
			}
			current.setNext(newNode);

		}
		size++;

	}

	public void printLinkedList() {

		Node current = head;
		while (current != null) {

			System.out.println(current.getData());
			current = current.getNext();

		}

	}

	public void removeFirst() {

		if (head == null) {
			System.out.println("Error: LL is empty...");
		} else {
			head = head.getNext();
		}

	}

	public void removeLast() {

		if (head == null) {
			System.out.println("Error... LL is empty");
		} else if (size == 1) {
			head = null;
		} else {
			Node current = head;
			while (current.getNext().getNext() != null) {
				current = current.getNext();
			}
			current.setNext(null);
		}
	}

	public Node get(int index) {
		
		Node current = head;
		for(int i = 0; i < index -1; i++) {
			current = current.getNext();
		}
		return current;
		
	}

}
