import java.util.Stack;

public class LinearQueueUsingStack {
    private Stack<Integer> stack1;
    private Stack<Integer> stack2;

    public LinearQueueUsingStack() {
        stack1 = new Stack<>();
        stack2 = new Stack<>();
    }

    public void enqueue(int item) {
        stack1.push(item);
    }

    public int dequeue() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return -1;
        }
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }
        return stack2.pop();
    }

    public void display() {
        if (stack1.isEmpty() && stack2.isEmpty()) {
            System.out.println("Queue is empty");
            return;
        }
        if (!stack2.isEmpty()) {
            for (int i = stack2.size() - 1; i >= 0; i--) {
                System.out.print(stack2.get(i) + " ");
            }
        }
        for (Integer item : stack1) {
            System.out.print(item + " ");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        LinearQueueUsingStack queue = new LinearQueueUsingStack();

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display(); // Output: 10 20 30

        System.out.println("Dequeued element: " + queue.dequeue()); // Output: Dequeued element: 10

        queue.display(); // Output: 20 30

        queue.enqueue(40);
        queue.enqueue(50);

        queue.display(); // Output: 20 30 40 50
    }
}
