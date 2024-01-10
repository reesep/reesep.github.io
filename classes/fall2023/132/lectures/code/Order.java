
public class Order {

	private String item;
	private String name;
	
	public Order(String i, String n) {
		this.item = i;
		this.name = n;
	}
	
	public void printOrder() {
		System.out.println(this.item + ". Ordered by: " + this.name);
	}
	
	public String getName() {
		return this.name;
	}
	
	public String getItem() {
		return this.item;
	}
}
