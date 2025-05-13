
class Stack {

    private int arr[];
    private int top;
    private int capacity;

    // Constructor to initialize stack
    Stack(int size) {
        arr = new int[size];
        capacity = size;
        top = -1;
    }




    // Push operation
    public void push(int item) {

        if (isFull()) {

            System.out.println("Stack Overflow! Cannot add " + item);
            return;
        }

        arr[++top] = item;
        System.out.println("Pushed: " + item);
    }




    // Pop operation
    public int pop() {

        if (isEmpty()) {

            System.out.println("Stack Underflow! Nothing to remove.");
            return -1;
        }
        return arr[top--];

    }

    // Peek operation
    public int peek() {


        if (!isEmpty()) {
            return arr[top];
        }
        System.out.println("Stack is empty.");
        return -1;
    }

    // Check if the stack is empty
    public boolean isEmpty() {
        return top == -1;
    }

    // Check if the stack is full
    public boolean isFull() {

        return top == capacity - 1;
    }

    // Display Stack elements
    public void display() {

        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack elements: ");
        for (int i = 0; i <= top; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
    
}
