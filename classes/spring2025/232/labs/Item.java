
public class Item {

	
	private String name;
	private double price;
	private int quantity;
	
	public Item(String n, double p, int q) {
		this.name = n;
		this.price = p;
		this.quantity = q;
	}
	
	public String getName() {
		return this.name;
	}
	
	public double getPrice() {
		return this.price;
	}
	
	public int getQuantity() {
		return this.quantity;
	}
	
	public void setPrice(double newPrice) {
		this.price = newPrice;
	}
	
}


