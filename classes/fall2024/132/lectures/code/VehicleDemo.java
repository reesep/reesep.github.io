

public class VehicleDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle car = new Car ("Toyota", "Corolla", 4);
		Vehicle truck = new Truck("Ford", "F-150", 5.0);
		
		Vehicle[] vehicles = {car , truck};
		for (Vehicle vehicle: vehicles) {
			vehicle.start();
		}
		
		System.out.println("total vehicles created: "+ Vehicle.getVehicleCount());
		
		
	}

}
