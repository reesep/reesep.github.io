
public class Bear extends GenericAnimal implements AnimalSound{

	private String diet;
	
	public Bear(String species, double weight, String continent, int population, String diet) {
		super(species, weight, continent, population);
		this.diet = diet;
	}
	
	public void makeSound() {
		System.out.println("Growllll");
	}
}
