package sept9;

public class FoodDemo {

	public static void main(String[] args) {
		
		Fruit apple = new Fruit("Apple", 95, 1, 5, false);
		Vegetable spinach = new Vegetable("Spinach", 7 , 3, "Fall", true);
		Citrus orange = new Citrus("Orange", 95, 1, 5, true, "Navel");
		
		System.out.println(apple.getName());
		System.out.println(spinach.getCalories());
		System.out.println(spinach.getGrowthSeason());
		
		System.out.println(orange.getIsTropical());
		orange.testMethod();

	}

}
