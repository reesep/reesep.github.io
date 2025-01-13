import java.util.ArrayList;
import java.util.List;

public class Lab10Demo {

	public static void main(String[] args) {
        String[] petName1 = {"m", "a", "x"};
        List<String> permutations1 = new ArrayList<>();

        generate_permutations(petName1, "", permutations1);
        System.out.println("Permutations of the password 'max': ");
        System.out.println("-----------------------------");
        print_permutations_recursive(permutations1);
        
        System.out.println();
        
        String[] petName2 = {"a", "n", "d", "y"};
        List<String> permutations2 = new ArrayList<>();

        generate_permutations(petName2, "", permutations2);
        System.out.println("Permutations of the password 'andy': ");
        System.out.println("-----------------------------");
        print_permutations_recursive(permutations2);
    }

    // Method to generate all permutations of an array of characters
    public static void generate_permutations(String[] characters, String perm, List<String> list) {
    	//TO DO: Use recursion to solve this problem
    }

    // Method to print the permutations
    public static void print_permutations_recursive(List<String> list) {
    	//TO DO: Use recursion to solve this problem
    }
}
