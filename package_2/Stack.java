package package_2;

public class Stack {private int maxSize;
    private int[] stackArray;
    private int top;

    // Constructors
    public Stack(int size) {
        this.maxSize = size;
        this.stackArray = new int[maxSize];
        this.top = -1;
    }

    // Method to push
    public void push(int element) {
        if (isFull()) {
            System.out.println("Stack is full. Cannot push element.");
            return;
        }
        top++;
        stackArray[top] = element;
    }

    // Method to pop
    public int pop() {
        if (isEmpty()) {
            System.out.println("Stack is empty. Cannot pop element.");
            return -1;
        }
        int poppedElement = stackArray[top];
        top--;
        return poppedElement;
    }

    // Method to check if the stack is empty
    public boolean isEmpty() {
        return (top == -1);
    }

    // Method to check if the stack is full
    public boolean isFull() {
        return (top == maxSize - 1);
    }

    // Method to peek
    public int peek() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return -1;
        }
        return stackArray[top];
    }

    // Method to display elements
    public void display() {
        if (isEmpty()) {
            System.out.println("Stack is empty.");
            return;
        }
        System.out.print("Stack (top to bottom): ");
        for (int i = top; i >= 0; i--) {
            System.out.print(stackArray[i] + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        Stack stack = new Stack(5);
        stack.push(10);
        stack.push(20);
        stack.push(30);
        stack.push(40);
        stack.push(50);

        stack.display(); // Display the stack

        System.out.println("Popped element: " + stack.pop()); // Pop an element
        System.out.println("Popped element: " + stack.pop()); // Pop an element

        System.out.println("Peeked element: " + stack.peek()); // Peek at the top element

        stack.display(); // Display the stack
    }
}
