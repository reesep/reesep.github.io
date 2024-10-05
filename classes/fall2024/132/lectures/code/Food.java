package sept9;

public class Food {
	
	protected String name;
	protected int calories;
	protected double price;
	
	public Food(String name, int calories, double price) {
		this.name = name;
		this.calories = calories;
		this.price = price;
	}
	
	public String getName() {
		return this.name;
	}
	
	public int getCalories() {
		return this.calories;
	}
	
	public double getPrice() {
		return this.price;
	}
	
}
