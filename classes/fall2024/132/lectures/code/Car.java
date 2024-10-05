

public class Car extends Vehicle{
	
	private int doors;

	public Car(String make, String model, int doors) {
		super(make, model);
		// TODO Auto-generated constructor stub
		this.doors = doors;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting the car: " + getMake() + " " + getModel()+ " with " + doors + " doors.");
		
	}
	
	public int getDoors() {
		return this.doors;
	}
	
	public void setDoors(int doors) {
		this.doors = doors;
	}
	
	
	

}
