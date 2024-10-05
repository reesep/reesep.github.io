public class ZooDemo {

	public static void main(String[] args) {
		
		Animal[] animals = new Animal[3];
		animals[0] = new Amphibian("Axolotl", 0.5, "North America", 500, "Earthworms");
		animals[1] = new Lion("Congo Lion", 400.0, "Africa", 30000, 15);
		animals[2] = new Bird("Emperor Penguin", 75, "Antarctica", 600000, 30);
		
		System.out.println("Welcome to the Zoo:");
		System.out.println("--------------------");
		
		//Inheritance is helpful when dealing with objects that share common properties
		for (Animal animal : animals) {
			System.out.println("Animal Species: " + animal.getSpecies());
			System.out.println("Animal Weight: " + animal.getWeight());
			System.out.println("Animal Origin: " + animal.getContinent());
			System.out.println("Animal Population: " + animal.checkPopulation());
			
			//Until they don't....
			if (animal instanceof Amphibian)
				System.out.println("Diet of a " + animal.getSpecies() + ": " + ((Amphibian)animal).getDiet());
			if (animal instanceof Lion)
				System.out.println("Lion pack size: " + ((Lion)animal).getPackSize());
			if (animal instanceof Bird)
				System.out.println("Wingspan of a " + animal.getSpecies() + ": " + ((Bird)animal).getWingSpan());
			
			animal.makeSound();
			System.out.println();
		}
		
		
		
	}

}