
public class Order {
	
	private String name;
	private String item;

	public Order(String n, String i) {
		this.name = n;
		this.item = i;
	}
	
	public String toString() {
		return item + "(" + name + ")";
	}
	
}
