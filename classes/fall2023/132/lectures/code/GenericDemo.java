
public class GenericDemo {

	public static void main(String[] args) {
		
		//GenericLinkedList linkedlist = new GenericLinkedList();
		
		//linkedlist.add(4.2);
		//linkedlist.add("hi");
		//linkedlist.add(123);
		
		//linkedlist.print();
		
		GenericQueue queue = new GenericQueue();
		queue.enqueue(123);
		queue.enqueue("hi1");
		queue.enqueue(3.14);
		
		queue.print();
		
		Object removed = queue.dequeue();
		System.out.println("Removed: " + removed);
		
		queue.print();
		

	}

}
