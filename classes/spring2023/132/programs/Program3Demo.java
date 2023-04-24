

import java.util.Scanner;


public class Program3Demo {

	
	public static void printmenu() {
		System.out.println("");
		System.out.println("1. View Current Building Plan");
		System.out.println("2. Add a new floor");
		System.out.println("3. Demolish top floor");
		System.out.println("4. Search for a classroom");
		System.out.println("5. View Building Information");
		System.out.println("6. Exit");
		System.out.println("");
	}
	
	
	public static void main(String[] args) {
		
		StackBuilding stack = new StackBuilding();
		
		System.out.println("Welcome to the Gianforte Hall Builder");
		printmenu();
		Scanner sc = new Scanner(System.in);
		
		int choice = 0;
		while(choice != 6) {
			System.out.println("Your choice?");
			choice = sc.nextInt();
			//System.out.println();
			if(choice == 1) {
				stack.printStack();
			}
			if(choice == 2) {
				stack.addFloor();
			}
			if(choice == 3) {
				stack.removeFloor();
			}
			if(choice == 4) {
				System.out.println("What class are you looking for?");
				String search = sc.next();
				search += sc.nextLine();
				stack.searchForClassroom(search);
			}
			if(choice == 5) {
				stack.printBuildingInfo();
			}
			if(choice == 6) {
				System.exit(0);
			}
			
			printmenu();
			
			
			
		}
		
		
		
		
		
		
		
		
		
	}

}
