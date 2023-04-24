
public class Hall {

	private String name;
	private int num_of_floors;
	
	public Hall(String n, int i) {
		this.name = n;
		this.num_of_floors = i;
	}
	
	public void printInfo() {
		System.out.println(this.name + " Number of Floors: " + this.num_of_floors);
	}
	
	
}
