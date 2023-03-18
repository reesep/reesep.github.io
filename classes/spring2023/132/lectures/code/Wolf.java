
public class Wolf extends GenericAnimal implements AnimalSound{
	
	private int pack_size;
	
	public Wolf(String species, double weight, String continent, int population, int pack_size) {
		super(species, weight, continent, population);
		this.pack_size = pack_size;
	}
	
	public void makeSound() {
		System.out.println("Awoooo");
	}
}


