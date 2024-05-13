

public class DogDemo {

	public static void main(String[] args) {
		
		// Part 1: Define class and constructor
		
		// 2.1 miles walked on Sunday, 0.5 miles on Monday, 0.0 on Tuesday, ...
		double[] tater_miles = {0.1, 0.54, 0.0, 1.2, 1.8, 0.0, 1.1};
		Dog my_dog = new Dog("Tater","Dachshund",8,14.3,tater_miles);
		
		
		double[] lucy_miles = {0.0, 1.8, 0.25, 0.0, 0.1, 0.002, 0.8};
		Dog lucy = new Dog("Lucy", "Aussie", 4, 44.25, lucy_miles);
		
		//Part 2: Define printInfo() method
		my_dog.printInfo();
		System.out.println();
		lucy.printInfo();
		System.out.println();
		
		//Part 3: Define getName() and get getDogAge() method
		System.out.println(my_dog.getName() + "'s Age in dog years is: " + my_dog.getDogAge());
		System.out.println(lucy.getName() + "'s Age in dog years is: " + lucy.getDogAge());
		System.out.println();
		
		//Part 4: Define getTotalMiles() method
		double total_miles = my_dog.getTotalMiles();
		System.out.println (my_dog.getName() + " walked a total of " + total_miles + " miles this week");
		System.out.println();
		
		//Part 5: Define checkWalkingScore() method
		my_dog.checkWalkingScore(total_miles);
		System.out.println();
		
		//More testing...
		total_miles = lucy.getTotalMiles();
		System.out.println(lucy.getName() + " walked a total of " + total_miles + " miles this week");
		System.out.println();
		
		lucy.checkWalkingScore(total_miles);
		
		
		

	}

}
