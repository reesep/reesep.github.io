public abstract class Vehicle {

	private static int vehicleCount;
	
	private String make;
	private String model;
	
	public Vehicle(String make, String model) {
		this.make = make;
		this.model = model;
		vehicleCount++;
	}
	
	public String getMake() {
		return this.make;
	}
	
	public String setMake(String make) {
		return this.make = make;
	}
	
	public String getModel() {
		return this.model;
	}
	
	public String setModel(String model) {
		return this.model = model;
	}
	
	public static int getVehicleCount() {
		return vehicleCount;
	}
	
	public abstract void start();
	
	
	
	
}
