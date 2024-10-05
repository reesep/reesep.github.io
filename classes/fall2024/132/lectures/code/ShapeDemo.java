
import java.util.Scanner;

public class ShapeDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a side length");
		
		while(!scanner.hasNextDouble()) {
			System.out.println("Enter a side length that is a number");
			scanner.nextLine();
		}
		
		double sideLength = scanner.nextDouble();
		
		System.out.println(sideLength);
		
		Square s = new Square(sideLength);
		System.out.println("Square Perimeter: " + s.perimeter() + " Area: " + s.area());
		
		EquilateralTriangle t = new EquilateralTriangle(sideLength);
//		System.out.println("Triangle Perimeter: " + t.perimeter() + " Area:" + t.area());
		System.out.printf("Triangle Perimeter: %.2f Area: %.2f %n", t.perimeter(), t.area());
		
		RegularHexagon h = new RegularHexagon(sideLength);
		System.out.printf("Hexagon Perimeter: %.2f Area: %.2f %n", h.perimeter(), h.area());
		
		scanner.close();
	}

}
