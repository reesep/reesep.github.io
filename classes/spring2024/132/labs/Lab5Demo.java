
public class Lab5Demo {

public static void main(String[] args) {
        
        SinglyLinkedList ll = new SinglyLinkedList();
        
        //Add values to Linked List
        ll.addToBack( new Node("Raiders of the Lost Ark",1981) );
        ll.addToBack( new Node("Titanic",1997) );
        ll.addToBack( new Node("Finding Nemo",2004) );
        
        ll.addToFront( new Node("Oppenheimer",2023) );
        ll.addToFront( new Node("Barbie",2023) );
        
        System.out.println("Movie List");
        ll.printList();
        System.out.println();
        
        //Remove first value
        ll.removeFirst();
        System.out.println("Movie List after removing a node");
        ll.printList();
        System.out.println();
        
        
        // Insert a movie at spot #3 in linked list
        ll.insert(new Node("Ratatouille",2007), 3 ); // this node should now become the 3rd thing in the linked list
        
        System.out.println("Movie List after inserting a node");
        ll.printList();
        System.out.println();
        
        // Search for a movie. One that exists, and one that does not.
        ll.searchForMovie("Titanic");
        ll.searchForMovie("Star Wars");
        ll.searchForMovie("Ratatouille");
        System.out.println();
        
        // Prints out # of nodes in linked list
        System.out.println("Number of movies in Linked List: " + ll.getSize()  );
        
    }


}
