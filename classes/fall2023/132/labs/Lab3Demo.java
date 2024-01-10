import java.util.Scanner;

public class Lab3Demo {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.print("Enter value: ");
		while (!scr.hasNextDouble()) {
			System.out.println("A number please: ");
			scr.nextLine();
		}
		double sideLength = Math.abs(scr.nextDouble());
		
		System.out.println("----------------------------------------------------");
		System.out.printf("%20S %15S %15S %n", "Regular Polygon", "Area", "Perimeter");
			
		// Test Triangle
		System.out.printf("%20s", "Equilateral Triangle");
		RegularPolygon myPoly = new EquilateralTriangle(sideLength);
		System.out.printf(" %15.2f %15.2f %n", myPoly.area(), myPoly.perimeter());
 
		// Test Square
		System.out.printf("%20s", "Square");
		myPoly = new Square(sideLength);
		System.out.printf(" %15.2f %15.2f %n", myPoly.area(), myPoly.perimeter());

		// Test Pentagon
		System.out.printf("%20s", "Regular Pentagon");
		myPoly = new RegularPentagon(sideLength);
		System.out.printf(" %15.2f %15.2f %n", myPoly.area(), myPoly.perimeter());
		
		// Test Hexagon
		System.out.printf("%20s", "Regular Hexagon");
		myPoly = new RegularHexagon(sideLength);
		System.out.printf(" %15.2f %15.2f %n", myPoly.area(), myPoly.perimeter());
		
		System.out.println("----------------------------------------------------");
		scr.close();

	}
}