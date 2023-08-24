
import java.util.Scanner;

public class Program1Demo {

	public static void main(String[] args) {
        AnimalTree tree = new AnimalTree();
        
        tree.breadthFirst(); //COMMENT THIS OUT after you have verified you tree is loaded correctly.
        
        String more = "Y";
        while (more.equals("Y")) {
            System.out.print("Do you have another animal to identify? (Y/N) > ");
            Scanner in = new Scanner(System.in);
            more = in.next();
            if (more.equals("Y")) {
                tree.identify();
            }
        }
        
        
    }

}
