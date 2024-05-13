import java.util.Scanner;

public class ShapesDemo {

	public static void main(String[] args) {
		
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a side length:");
		while(!scanner.hasNextDouble()) {
			System.out.println("Enter a side length:");
			scanner.nextLine();
		}
		double sideLength = scanner.nextDouble();
		
		Square s = new Square(sideLength);
		System.out.println("Square Perimeter: " + s.perimeter() + " Area: " + s.area());

		EquilateralTriangle t = new EquilateralTriangle(sideLength);
		System.out.printf("Triangle Perimeter: %.2f  Area: %.2f  %n",t.perimeter(), t.area());
		
		RegularPentagon p = new RegularPentagon(sideLength);
		System.out.printf("Pentagon Perimeter: %.2f  Area: %.2f  %n",p.perimeter(), p.area());
		
	}

}
