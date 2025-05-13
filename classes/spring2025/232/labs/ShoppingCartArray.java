
public class ShoppingCartArray {

	private Item[] cart;
	private int num_of_items;
	
	public ShoppingCartArray() {
		this.cart = new Item[0];
		this.num_of_items = 0;
	}
	
	public void addItem(String name, double price, int quantity) {
		Item item = new Item(name, price, quantity);

		Item[] tempArray = new Item[cart.length+1];
		
		for(int i = 0; i < cart.length; i++) {
			tempArray[i] = cart[i];
		}
		
		tempArray[cart.length] = item;
		cart = tempArray;
		num_of_items++;
		
	}
	
	public void printCart() {
		System.out.println("Shopping Cart");
		System.out.println("---------------------");
		for(Item i: cart) {
			System.out.println(i.getName() + " " + i.getPrice() + " " + i.getQuantity());
		}
	}

	public void searchForItem(String name) {
		//TO DO: Search for item in Array
	}
	
	public void removeItem(String name) {
		// TO DO: Remove item from Array
	}
	
}
