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
	
	
	public void fillLinkedList(String filename) {
		
		try {
			Scanner input = new Scanner( new FileReader(filename) );
			
			while(input.hasNext()) {
				String line = input.nextLine();
				
				String[] vals = line.split(",");
				String code = vals[0];
				String location = vals[1];
				Node n = new Node(code, location);
				insert(n, this.size+1);
				
			}
			
		} catch (FileNotFoundException e) {
			System.out.println("sadasdasds");
			e.printStackTrace();
		}
		
	}
	
	public void insert(Node newNode, int n) {
		
		if(this.size == 0) {
			//case 1: insert into empty linked list
			this.head = newNode;
			this.tail = newNode;
		}
		else if(n == 1) {
			//case 2: insert at front of linked list
			this.head.setPrev(newNode);
			newNode.setNext(this.head);
			this.head = newNode;
			
			//CLL: Reattach head and tail
			this.head.setPrev(this.tail);
			this.tail.setNext(this.head);
			
		}
		else if(n == this.size + 1) {
			//case 3: insert at end of linked list
			this.tail.setNext(newNode);
			newNode.setPrev(this.tail);
			this.tail = newNode;
			
			//CLL: Reattach head and tail
			this.head.setPrev(this.tail);
			this.tail.setNext(this.head);
		}
		else {
			//case 4: insert somewhere in the middle of linked list
			
			Node current = this.head;
			
			//traverse to the Nth node
			for(int i = 0; i < n-1; i++) {
				current = current.getNext();
			}
			
			Node prevNode = current.getPrev();
		
			current.setPrev(newNode);
			newNode.setNext(current);
			
			prevNode.setNext(newNode);
			newNode.setPrev(prevNode);
			
		}
		this.size++;
	}

	
	
	public void printLinkedList() {
		//update for CLL

		Node current = head;
		do {
			current.printNode();
			current = current.getNext();
		}while(current != head);
	}


	public void remove(String search) {
		
		Node current = head;
		while(current != null) {
			
			if(current.getCode().equals(search) ) {
				
				if(current == head) {
				    //removing head
					head = current.getNext();
					head.setPrev(null);
					
					//CLL: Reattach head and tail
					this.head.setPrev(this.tail);
					this.tail.setNext(this.head);
					
				}
				else if(current == tail) {
					//removing the tail
					tail = current.getPrev();
					tail.setNext(null);
					
					//CLL: Reattach head and tail
					this.head.setPrev(this.tail);
					this.tail.setNext(this.head);
				}
				else {
					Node nextNode = current.getNext();
					Node prevNode = current.getPrev();
					prevNode.setNext(nextNode);
					nextNode.setPrev(prevNode);
				}
				this.size--;
			}
			current = current.getNext();
			
			
		}
		
	}


	public void printReverse() {
		
		Node current = tail;
		while(current != null) {
			current.printNode();
			current = current.getPrev();
		}
		
	}


	public void removeSpot(int n) {
		
		Node current = head;
		for(int i = 0; i < n -1; i++) {
			current = current.getNext();
		}
		
		if(current == head) {
		    //removing head
			head = current.getNext();
			head.setPrev(null);
		}
		else if(current == tail) {
			//removing the tail
			tail = current.getPrev();
			tail.setNext(null);
		}
		else {
			//removing middle
			Node nextNode = current.getNext();
			Node prevNode = current.getPrev();
			prevNode.setNext(nextNode);
			nextNode.setPrev(prevNode);
		}
		this.size--;
	}
}
