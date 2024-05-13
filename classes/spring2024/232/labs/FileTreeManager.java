
import java.util.Scanner;

public class FileTreeManager {

	private FileTree tree;
	
	public FileTreeManager() {
		this.tree = new FileTree();
	}
	
	public void run() {
		
		String command = "";
		Scanner scanner = new Scanner(System.in);
		while( !command.equals("exit")) {
			System.out.println(tree.getCurrentLocation() + "$: ");
			command = scanner.nextLine();
			executeCommand(command);
		}
	
	}
	
    private void executeCommand(String command) {
        int breakPoint = command.indexOf(" ");
        String argument = null;
        if (breakPoint != -1) {
            argument = command.substring(breakPoint + 1, command.length());
            command = command.substring(0, breakPoint);
        }

        if (command.equals("cd")) {
            if (!move(argument)) {
                System.out.println("cd: no such file or directory: " + argument + "\n");
            }
        } else if (command.equals("ls")) {
            System.out.println(tree.getChildren());
        } else if (command.equals("mkdir")) {
            if (!tree.insert(argument)) {
                System.out.println("Invalid file name.\n");
            }
        } else if (command.equals("rm")) {
            if (!tree.remove(argument)) {
                System.out.println("File not found.\n");
            }
        } else if (command.equals("exit")) {

        } else if (command.equals("pwd")) {
            System.out.println(tree.getPath());
        } else {
            System.out.println("'" + command + "' is not a recognized command");
        }
    }

    private boolean move(String file) {
        if (file == null || file.equals("") || file.equals("~")) {
            tree.goHome();
            return true;
        }

        if (file.equals("..")) {
            tree.moveUp();
            return true;
        }

        return tree.moveDown(file);
    }
    
    public void test() {  
        tree.insert("School");
        tree.moveDown("School");
        tree.insert("CSCI476");
        tree.insert("CSCI232");
        tree.moveDown("CSCI232");
        tree.insert("Labs");
        tree.insert("Programs");
        tree.goHome();
        
        tree.insert("Pictures");
        tree.moveDown("Pictures");
        tree.insert("Pets");
        tree.insert("Memes");
        tree.insert("CanadaTrip");
        tree.moveDown("Pets");
        tree.insert("Meatball");
        tree.insert("Tater");
        tree.moveDown("Meatball");
        tree.insert("2023");
        tree.insert("2024");
        tree.goHome();
        tree.insert("Work");
        tree.moveDown("Work");
        tree.insert("Paystubs");
        tree.goHome();
        tree.insert("Documents");

        tree.goHome();
      
        run();
    }       
	
}
