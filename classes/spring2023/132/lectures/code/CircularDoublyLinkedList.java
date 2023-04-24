
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

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
			
			//CLL: Make sure head and tail are attached
			this.head.setPrev(this.tail);
			this.tail.setNext(this.head);
		}
		
		//Case #3 Insert at the end
		else if(n == this.size+1) {
			this.tail.setNext(newNode);
			newNode.setPrev(this.tail);
			this.tail = newNode;
			
			//CLL: Make sure head and tail are attached
			this.head.setPrev(this.tail);
			this.tail.setNext(this.head);
		}
		
		//Case #4 Insert somewhere in the middle
		else {
			
			
			Node current = this.head;
		
			for(int i = 1 ; i < n-1; i++) { //LOOP n-1 times ot reach N-1 node
				current = current.getNext();
			}
			Node nextNode = current.getNext();
			current.setNext(newNode);
			newNode.setPrev(current);
			nextNode.setPrev(newNode);
			newNode.setNext(nextNode);
			
		} //end else
		this.size++;
		
	}
	
	
	
	public void printLinkedList() {
		
		Node current = this.head;
		do {
			current.printNode();
			current = current.getNext();
		}while(current != this.head);
		
		
	}
	
	
public void remove(String search) {
        
        Node current = this.head;
        while(current.getNext() != null) {
            
            if(current.getCode().equals(search)) {
                
                
                if(current == this.head) {
                    //removing the head
                    this.head = this.head.getNext();
                    this.head.setPrev(null);
                    
                    //reattach head and tail
        			this.head.setPrev(this.tail);
        			this.tail.setNext(this.head);
                }
                if(current == this.tail) {
                    //removing the tail
                    this.tail = this.tail.getPrev();
                    this.tail.setNext(null);
                    
                    //reattach head and tail
        			this.head.setPrev(this.tail);
        			this.tail.setNext(this.head);
                }
                else {
                    //removing something in the middle  
                    
                	Node prevNode = current.getPrev();
                	Node nextNode = current.getNext();
                	
                	prevNode.setNext(nextNode);
                	nextNode.setPrev(prevNode);
                	
                }
                break; //we removed a node, so lets stop looping.
               
            } //end of if statement
            current = current.getNext();
            
        }//end of while loop
	
	} //end of method


}
	
	
	

