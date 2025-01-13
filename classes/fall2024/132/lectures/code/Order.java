
public class Order {
	
	private String name;
	private String entree;
	private String drink;
	
	public Order(String n, String e, String d) {
		this.name = n;
		this.entree = e;
		this.drink = d;
		
	}
	
	public String toString() {
		return "Order Name " + this.name + "\n"+ "Entree: " + this.entree + "\n"+ 
				"Drink " + this.drink + "\n";
		
	}

}
