
public class Lab6Demo {

	public static void main(String[] args) {
		
		CircularLinkedList cll = new CircularLinkedList();
		
		
		cll.addAfterTail( new Node("France") );
		cll.addAfterTail( new Node("USA") );
		cll.addAfterTail( new Node("Japan") );
		cll.addAfterTail( new Node("Greece") );
		cll.addAfterTail( new Node("Mexico") );
		cll.addAfterTail( new Node("Egypt") );
		
		System.out.println("List of Countries to visit");
		System.out.println("--------------------------");
		cll.printCircularLinkedList(false); // false = normal order
		System.out.println();
		
		
		System.out.println("List of Countries to visit (In reverse order)");
		System.out.println("--------------------------");
		cll.printCircularLinkedList(true); // true = reverse order
		System.out.println();
		
		System.out.println("Selecting a random country from the list (normal order)");
		Node n1 = cll.selectRandomCountry(false); //false =  normal order
		System.out.println();
		

		cll.remove(n1);

		
		System.out.println("Selecting a random country from the list (reverse order)");
		Node n2 = cll.selectRandomCountry(true); // true = reverse order
		System.out.println();
		
		
		cll.remove(n2);
		
		System.out.println("List of Countries to visit (After Removal)");
		System.out.println("--------------------------");
		cll.printCircularLinkedList(false); // false = normal order
		System.out.println();
		
		
		
		

	}

}
