
public class GenericsDemo {

	public static void main(String[] args) {
		
		/*
		GenericLinkedList linkedList = new GenericLinkedList();
		
		linkedList.add("Reese");
		linkedList.add(123);
		linkedList.add(3.14);
		
		linkedList.print();
		*/
		GenericQueue queue = new GenericQueue<String>();
		queue.enqueue("CSCI 132");
		queue.enqueue(123);
		queue.enqueue(3.14);
		
		queue.print();
		System.out.println(queue.dequeue());
		System.out.println();
		queue.print();
		
		
	}

}
