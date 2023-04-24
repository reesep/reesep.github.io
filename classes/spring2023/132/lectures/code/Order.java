
public class Order {

	private String food;
	private String name;
	
	public Order(String f, String n) {
		this.food = f;
		this.name = n;
	}
	
	public void printOrder(int order_num) {
		System.out.println(order_num + "." + this.food + ". Ordered by: " +this.name);
	}
	
	public String getName() {
		return this.name;
	}
}
