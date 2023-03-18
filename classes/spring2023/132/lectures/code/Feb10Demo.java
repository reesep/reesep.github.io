
public class Feb10Demo {

	public static void main(String args[]) {
		
		AnimalSound a1 = new Bird("Puffin",27.0, "North America",7400000,21.5);
		Bird a2 = new Bird("Puffin",27.0, "North America",7400000,21.5);
		//GenericAnimal a3 = new Bird("Puffin",27.0, "North America",7400000,21.5);
		
		//AnimalSound b1 = new Wolf("Arctic Wolf",120.0, "North America",200000, 16);
		Wolf b2 = new Wolf("Arctic Wolf",120.0, "North America",200000, 16);
		
		a1.makeSound();
		a2.makeSound();
		//a3.makeSound();

		//b1.makeSound();
		b2.makeSound();
		
		
	}

	
}
