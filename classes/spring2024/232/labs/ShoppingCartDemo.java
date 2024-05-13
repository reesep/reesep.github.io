
public class ShoppingCartDemo {

	public static void main(String[] args) {
		
		// Part 1
		ShoppingCartArray cart = new ShoppingCartArray();
		cart.addItem("Milk",2.99,2);
		cart.addItem("Flour",5.99,1);
		cart.addItem("Cheese",1.99,1);
		cart.addItem("Doritos",2.50,2);
	
		cart.printCart();
		
		System.out.println();
		cart.searchForItem("Flour");
		cart.searchForItem("Sugar");
		System.out.println();
		
		System.out.println("Removing item....");
		cart.removeItem("Cheese");
		cart.printCart();
		
		System.out.println();
		
		// Part 2
		ShoppingCartLinkedList cart2 = new ShoppingCartLinkedList();
		cart2.addItem("Ketchup",1.99,1);
		cart2.addItem("Chicken",7.99,2);
		cart2.addItem("Butter",0.99,3);
		cart2.addItem("Bread",3.99,1);
		
		cart2.printCart();
		
		System.out.println();
		cart2.searchForItem("Bread");
		cart2.searchForItem("Sugar");
		System.out.println();
		
		System.out.println("Removing item....");
		cart2.removeItem("Chicken");
		cart2.printCart();


	}

}
