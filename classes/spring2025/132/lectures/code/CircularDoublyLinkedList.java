import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CircularDoublyLinkedList {

	private Node head;
	private Node tail;
	private int size;
	
	public CircularDoublyLinkedList(String filename) {
		
		this.head = null;
		this.tail = null;
		this.size = 0;
		
		fillLinkedList(filename);
		
	}

	public void fillLinkedList(String filename) {
		
		FileReader file;
		try {
			file = new FileReader(filename);
			Scanner input = new Scanner(file);
			
			while(input.hasNext()) {
				
				String line = input.nextLine();
				String[] split = line.split(",");
				
				String code = split[0];
				String city = split[1];
				
				Node n = new Node(code, city);
				insert(n, size + 1);
				
			}
			
			
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
	}
	
	public void insert(Node newNode, int spot) {
		
		//case 1: LL is empty
		if(head == null && tail == null) {
			head = newNode;
			tail = newNode;
			size++;
		}
		
		//case 2: insert at start (new head)
		else if(spot == 1) {
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;
			size++;
		}
		
		//case 3: insert at the end (new tail)
		else if(spot == size + 1) {
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail = newNode;
			size++;
		}
		
		//case 4: insert in the middle
		else {
			
			Node current = head;
			for(int i = 0; i < spot - 1; i++) {
				current = current.getNext();
			}
			Node prevNode = current.getPrev();
			prevNode.setNext(newNode);
			newNode.setPrev(prevNode);
			newNode.setNext(current);
			current.setPrev(newNode);
		}
		//NEW: reattach head and tail
		head.setPrev(tail);
		tail.setNext(head);
	}
	
	
	public void print() {
		
		Node current = head;
		do {
			System.out.println(current.getInfo());
			current = current.getNext();
		}while(current != head);
		
	}
	
	public void printReverse() {
		
		Node current = tail;
		do {
			System.out.println(current.getInfo());
			current = current.getPrev();
		}while(current != tail);
		
	}

	public void remove(String search) {
		
		Node current = head;
		do {
			
			if(current.getCode().equals(search)) {
				
				//case 1: head is removed
				if(current == head) {
					head = current.getNext();
					//head.setPrev(null);
				}
				//case 2: tail is removed
				else if(current == tail) {
					tail = current.getPrev();
					//tail.setNext(null);
				}
				//case 3: something in middle
				else {
					Node prevNode = current.getPrev();
					Node nextNode = current.getNext();
					prevNode.setNext(nextNode);
					nextNode.setPrev(prevNode);
				}
			}
			current = current.getNext();
		}while(current != head);
		//NEW: reattach head and tail
		head.setPrev(tail);
		tail.setNext(head);
	}
	
	
	
	
	
	
	
	
	
	
	
}
