import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

public class DoublyLinkedList {

	private Node head;
	private Node tail;
	
	private int size;
	
	public DoublyLinkedList() {
		this.head = null;
		this.tail = null;
		this.size = 0;
	}
	
	public void fillLinkedList(String filename) {
		
		try {
			Scanner input = new Scanner( new FileReader(filename));
			
			while(input.hasNext()) {
				String line = input.nextLine();
				String[] splitted = line.split(",");
				String code = splitted[0];
				String city = splitted[1];
				
				Node newNode = new Node(code, city);
				
				insert(newNode, this.size + 1);
				
			}
			
		} catch (FileNotFoundException e) {
			
			e.printStackTrace();
		}
		
	}
	
	public void insert(Node newNode, int n) {
		
		if(this.size == 0) {
			//case 1: LL is empty
			head = newNode;
			tail = newNode;
		}
		else if(n == 1) {
			//case 2: insert at beginning
			head.setPrev(newNode);
			newNode.setNext(head);
			head = newNode;
			
		}
		else if(n == size + 1) {
			//case 3: insert at end
			tail.setNext(newNode);
			newNode.setPrev(tail);
			tail = newNode;
				
		}
		else {
			//case 4: somewhere in the middle
			// get to Nth node
			
			Node current = head;
			for(int i = 0; i < n - 1; i++) {
				current = current.getNext();
			}
			Node prevNode = current.getPrev();
			
			current.setPrev(newNode);
			newNode.setNext(current);
			prevNode.setNext(newNode);
			newNode.setPrev(prevNode);
			
		}
		this.size ++;
	}
	public void remove(String code) {
		
		
		if(head == null && tail == null) {
			System.out.println("Cannot remove from empty LL");
			return;
		}else {
			
			Node current = head;
			while(current != null) {
				
				if(current.getCode().equals(code)) {
					
					if(current == head) {
						head = current.getNext();
						head.setPrev(null);
					}
					else if(current == tail){
						tail = tail.getPrev();
						tail.setNext(null);
					}
					else {
						
						Node prevNode = current.getPrev();
						Node nextNode = current.getNext();
						prevNode.setNext(nextNode);
						nextNode.setPrev(prevNode);
						
					}
					size--;
					
				}
				current = current.getNext();
				
				
				
			}
			
		}
		
	}
	
	
	public void print() {
		
		Node current = head;
		while(current != null) {
			System.out.println(current.getInfo());
			current = current.getNext();
		}
	}
	
	public void printReverse() {
		Node current = tail;
		while(current != null) {
			System.out.println(current.getInfo());
			current = current.getPrev();
		}
	}
	
}
