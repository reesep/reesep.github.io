public class StackDemo {
    public static void main(String[] args) {
        Stack stack = new Stack(5);  // Create stack of size 5

        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.display();  // Stack: 10 20 30

        System.out.println("Top element is: " + stack.peek());

        System.out.println("Popped element: " + stack.pop());
        stack.display();  // Stack: 10 20

        System.out.println("Popped element: " + stack.pop());
        System.out.println("Popped element: " + stack.pop());
        stack.pop();  // Should print Stack Underflow
    }
}
