import java.util.Scanner;

public class ShapeDemo {

	public static void main(String[] args) {
		
		Scanner scr = new Scanner(System.in);
		
		System.out.println("Enter a side length value:");
		
		while(!scr.hasNextDouble()) {
			System.out.println("A number please! ");
			scr.nextLine();
		}
		
		double sideLength = scr.nextDouble();
		
		Triangle t = new Triangle(sideLength);
		System.out.printf("The area is: %.2f \n",t.area());
		System.out.println(t.perimeter());
		
		Square s = new Square(sideLength);
		System.out.printf("The area is: %.2f \n",s.area());
		System.out.println(s.perimeter());
		
		Pentagon p = new Pentagon(sideLength);
		System.out.printf("The area is: %.2f \n",p.area());
		System.out.println(p.perimeter());
		

	}

}
