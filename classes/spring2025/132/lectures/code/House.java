
public class House {

	private int bedrooms;
	private int bathrooms;
	private String color;
	
	public House(int bedrooms, int bathrooms, String color) {
		this.bedrooms = bedrooms;
		this.bathrooms = bathrooms;
		this.color = color;
	}
	
	public int getBedrooms() {
		return this.bedrooms;
	}
	
	public int getBathrooms() {
		return this.bathrooms;
	}
	
	public String getColor() {
		return this.color;
	}
	
	public void setColor(String newColor) {
		this.color = newColor;
	}
}
