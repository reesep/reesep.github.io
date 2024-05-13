
public class ZooDemo {

	public static void main(String[] args) {
		
		
		
		Bear panda = new Bear("Panda Bear",300.0, "Asia",1800,"Bamboo");
		
		Wolf arctic_wolf = new Wolf("Arctic Wolf",120.0, "North America",200000, 16);
		
		Bird puffin = new Bird("Puffin",27.0, "North America",7400000,21.5);
		

		System.out.println("Welcome to the Zoo:");
		System.out.println("--------------------");
		
		System.out.println("Animal Species: " + panda.getSpecies());
		System.out.println("Animal Weight: " + panda.getWeight());
		System.out.println("Animal Origin: " + panda.getContinent());
		System.out.println("Animal Population: " + panda.checkPopulation());
		System.out.println("Diet of a " + panda.getSpecies() + ": " + panda.getDiet());
		panda.makeSound();
		System.out.println();
		
		
		System.out.println("Animal Species: " + arctic_wolf.getSpecies());
		System.out.println("Animal Weight: " + arctic_wolf.getWeight());
		System.out.println("Animal Origin: " + arctic_wolf.getContinent());
		System.out.println("Animal Population: " + arctic_wolf.checkPopulation());
		System.out.println("Wolf pack size: "+ arctic_wolf.getPackSize());
		arctic_wolf.makeSound();
		System.out.println();
		
		System.out.println("Animal Species: " + puffin.getSpecies());
		System.out.println("Animal Weight: " + puffin.getWeight());
		System.out.println("Animal Origin: " + puffin.getContinent());
		System.out.println("Animal Population: " + puffin.checkPopulation());
		System.out.println("Wingspan of a " + puffin.getSpecies() + ": " + puffin.getWingSpan());
		puffin.makeSound();
		System.out.println();
		
		

	}

}
