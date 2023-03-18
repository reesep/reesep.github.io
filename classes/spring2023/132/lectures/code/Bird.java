
public class Bird extends GenericAnimal implements AnimalSound{

	private double wingspan;
	
	public Bird(String species, double weight, String continent, int population, double wingspan) {
		super(species, weight, continent, population);
		this.wingspan = wingspan;
	}
	
	public void makeSound() {
		System.out.println("Chirp Chirp");
	}
	
}
