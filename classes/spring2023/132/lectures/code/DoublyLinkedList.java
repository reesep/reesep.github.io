
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
		
		String line = "";
		try {
			BufferedReader br = new BufferedReader( new FileReader(filename));
			while( (line=br.readLine()) != null) {
				String[] vals = line.split(",");
				String code = vals[0];
				String location = vals[1];
				
				Node n = new Node(code, location);
				insert(n, this.size+1);
			}
		} catch (Exception e) {
			// TODO Auto-generated catch block
			System.out.println("File Not found");
		}
		
	}
	
	
	public void insert(Node newNode, int n) {
		
		//Case #1 Linked List is Empty
		if(this.size == 0) {
			this.head = newNode;
			this.tail = newNode;
		}
		
		//Case #2 Insert at the beginning 
		else if(n == 1) {
			this.head.setPrev(newNode);
			newNode.setNext(this.head);
			this.head = newNode;
		}
		
		//Case #3 Insert at the end
		else if(n == this.size+1) {
			this.tail.setNext(newNode);
			newNode.setPrev(this.tail);
			this.tail = newNode;
		}
		
		//Case #4 Insert somewhere in the middle
		else {
			
			int counter = 1;
			Node current = this.head;
			while(current.getNext() != null) {
				
				if(counter == n-1) {
					
					Node nextNode = current.getNext();
					
					current.setNext(newNode);
					newNode.setPrev(current);
					
					nextNode.setPrev(newNode);
					newNode.setNext(nextNode);
					
				}
				
				
				current = current.getNext();
				counter++;
			}
			
			
		}
		
		this.size++;
		
	}
	
	
	
	public void printLinkedList() {
		
		Node current = this.head;
		while(current != null) {
			current.printNode();
			current = current.getNext();
		}
	}
	
	
	
	
	
}
