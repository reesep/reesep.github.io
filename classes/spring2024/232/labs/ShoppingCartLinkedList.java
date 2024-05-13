import java.util.LinkedList;

public class ShoppingCartLinkedList {

	private LinkedList<Item> shoppingCart;
	private int num_of_items;
	
	public ShoppingCartLinkedList() {
		this.shoppingCart = new LinkedList<Item>();
		this.num_of_items = 0;
	}
	
	public void addItem(String name, double price, int quantity) {
		Item item = new Item(name, price, quantity);
		shoppingCart.add(item);
		num_of_items++;
	}
	
	public void printCart() {
		System.out.println("Shopping Cart");
		System.out.println("---------------------");
		for(Item i: shoppingCart) {
			System.out.println(i.getName() + " " + i.getPrice() + " " + i.getQuantity());
		}
	}
	
	public void searchForItem(String name) {
		//TO DO: Search for item in LinkedList
	}
	
	public void removeItem(String name) {
		// TO DO: Remove item from LinkedList
	}
	
	
}
