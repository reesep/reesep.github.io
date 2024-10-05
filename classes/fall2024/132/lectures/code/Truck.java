public class Truck extends Vehicle{
	
	private double loadCap;

	public Truck(String make, String model, double loadCap) {
		super(make, model);
		// TODO Auto-generated constructor stub
		this.loadCap = loadCap;
	}

	@Override
	public void start() {
		// TODO Auto-generated method stub
		System.out.println("Starting the truck: " + getMake() + " " + getModel()+ " with " + loadCap + " load capacity.");

		
	}
	
	public double getLoadCap() {
		return this.loadCap;
	}
	
	public void setLoadCap(double loadCap) {
		this.loadCap = loadCap;
	}
	

}
