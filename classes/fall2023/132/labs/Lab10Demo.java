
import java.util.Stack;

public class Lab10Demo {


	public static String fix_string(String s) {
		//TO DO: Use recursion to solve this problem

		
	}
	
	public static void print_stack_reverse_recursive(Stack<String> stack) {
		//TO DO: Use recursion to solve this problem
	
	}
	
	
	
	//You should NOT change anything below this comment
	public static void main(String[] args) {
		
		Stack<String> stack = new Stack<String>();
		
		stack.push("ctgtcctt");
		stack.push("agtgccct");
		stack.push("taacgcgg");
		stack.push("ccctcagt");
		stack.push("ggataata");
		stack.push("gtgaatgc");
			
		System.out.println("Printing out the stack in reverse order:");
		System.out.println();
		print_stack_reverse_recursive(stack);
	}

}
