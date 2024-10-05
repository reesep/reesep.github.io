import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class CircularDoublyLinkedList {

	private Node head;
	private Node tail;
	
	private int size;
	
	public CircularDoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void fillLinkedList() {
		
		try {
			Scanner input = new Scanner(new FileReader("airports.txt"));
			
			while(input.hasNext()) {
				
				String line = input.nextLine();
				String[] values = line.split(",");
				
				String code = values[0];
				String city = values[1];
				
				Node newNode = new Node(code, city);
				
				insert(newNode, this.size + 1);
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("file not found");
		}
		
		
	}
	
	public void insert(Node newNode, int n) {
		
		if(this.size == 0) { //insert into empty LL
			this.head = newNode;
			this.tail = newNode;
		}
		else if(n == 1) { //insert at the beginning
			this.head.setPrev(newNode);
			newNode.setNext(this.head);
			this.head = newNode;
		}
		else if(n == this.size + 1) { //insert at the end
			this.tail.setNext(newNode);
			newNode.setPrev(this.tail);
			this.tail = newNode;
		}
		else { //insert somewhere in the middle
			
			Node current = this.head;
			for(int i = 0; i < n - 1; i++) {
				current = current.getNext();
			}
			Node prevNode = current.getPrev();
			current.setPrev(newNode);
			newNode.setNext(current);
			prevNode.setNext(newNode);
			newNode.setPrev(prevNode);
		}
		head.setPrev(tail);
		tail.setNext(head);
		this.size++;
	}
	
	public void printLinkedList() {
		
		Node current = head;
		do {
			System.out.println(current.getData());
			current = current.getNext();
		} while(current != head); 
		
	}
	
	public void remove(String search) {
		
		Node current = head;
		do {

			if(current.getCode().equals(search)) {
				
				if(current == head) {
					head = current.getNext();
					head.setPrev(null);
					
				}
				else if(current == tail) {
					
					tail = current.getPrev();
					tail.setNext(null);
					
				}
				else {
					
					Node prevNode = current.getPrev();
					Node nextNode = current.getNext();
					
					prevNode.setNext(nextNode);
					nextNode.setPrev(prevNode);
					
					
				}		
			}
			current = current.getNext();
		}while(current != head);
		this.size--;
		head.setPrev(tail);
		tail.setNext(head);
	}
	
	public void remove(int spot) {
		
		Node current = head;
		for(int i = 0; i < spot - 1; i++) {
			current = current.getNext();
		}
		
		if(current == head) {
			head = current.getNext();
			head.setPrev(null);
			
		}
		else if(current == tail) {
			
			tail = current.getPrev();
			tail.setNext(null);
			
		}
		else {
			
			Node prevNode = current.getPrev();
			Node nextNode = current.getNext();
			
			prevNode.setNext(nextNode);
			nextNode.setPrev(prevNode);
			
			
		}		
		this.size--;
		head.setPrev(tail);
		tail.setNext(head);
		
	}

	public void printLinkedListReversed() {
		
		Node current = tail;
		do{
			System.out.println(current.getData());
			current = current.getPrev();
		} while(current != tail);
	}
	
	
	
	
	
}