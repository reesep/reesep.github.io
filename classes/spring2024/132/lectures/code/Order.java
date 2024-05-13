
public class Order {

	private String name;
	private String entree;
	private String side;
	
	public Order(String n, String e, String s) {
		this.name = n;
		this.entree = e;
		this.side = s;
	}
	
	public String getInfo() {
		return "Order Name: " + this.name + "\n" + "Entree: " + this.entree + "\n" + "Side: " + this.side;
	}
	
}
