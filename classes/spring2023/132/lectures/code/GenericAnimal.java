
public class GenericAnimal {

	protected String species;
	protected double weight;
	protected String continent;
	protected int population;
	
	public GenericAnimal(String species, double weight, String continent, int population) {
		this.species = species;
		this.weight = weight;
		this.continent = continent;
		this.population = population;
	}
	
	public String getSpecies() {
		return this.species;
	}
	
	public double getWeight() {
		return this.weight;
	}
	
	public String getContinent() {
		return this.continent;
	}
	
	
}
