
public class Lab1Demo {

	public static void main(String[] args) {
		
		//Part 1. Define Item class
		Item laptop = new Item("MacBook Air", 899.99, new double[]{4.0, 5.0, 5.0, 5.0} );
		Item iphone = new Item("Apple iPhone 13", 579.99, new double[]{3.0, 4.0, 5.0, 5.0, 3.0, 3.0, 5.0} );
		Item pencil = new Item("Apple Pencil", 79.99, new double[]{2.0, 1.0, 3.0});
		
		
		//Part 2. Write methods in Item class
		System.out.println("Item: " + laptop.getName());
		System.out.println("Cost: $" + laptop.getPrice());
		System.out.println("Average Rating: " + laptop.getAverageRating());
		
		System.out.println();
		

		System.out.println("Item: " + iphone.getName());
		System.out.println("Cost: $" + iphone.getPrice());
		System.out.println("Average Rating: " + iphone.getAverageRating());
		
		System.out.println();
		
		System.out.println("Item: " + pencil.getName());
		System.out.println("Cost: $" + pencil.getPrice());
		System.out.println("Average Rating: " + pencil.getAverageRating());
		
		System.out.println();
		
		//Part 3. Define Customer class, write methods in Customer class
		Item[] steveCart = new Item[] {laptop, iphone, pencil};
		Customer steve = new Customer("Steve", steveCart);
		
		System.out.println(steve.getName() + "'s cart total: $" + steve.getCartCost());
		
		System.out.println("Applying discounts....");
		steve.applyDiscounts();
		
		System.out.println(steve.getName() + "'s new cart total: $" + steve.getCartCost());
		
		
	}

}
