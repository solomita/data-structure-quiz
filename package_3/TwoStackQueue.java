package package_3;
import java.util.Stack;
public class TwoStackQueue {  private Stack stack1;
    private Stack stack2;

    public TwoStackQueue(int maxSize) {
        this.stack1 = new Stack(maxSize);
        this.stack2 = new Stack(maxSize);
    }

    public void enqueue(int element) {
        if (stack1.isFull()) {
            System.out.println("Queue is full. Cannot enqueue element.");
            return;
        }

        stack1.push(element);
    }

    // Method to dequeue an element from the queue
    public int dequeue() {
        if (isEmpty()) {
            System.out.println("Queue is empty. Cannot dequeue element.");
            return -1;
        }

        // If stack2 is empty, transfer elements from stack1 to stack2
        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.pop();
    }

    public int peek() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return -1;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        return stack2.peek();
    }

    public boolean isEmpty() {
        return (stack1.isEmpty() && stack2.isEmpty());
    }

    public void display() {
        if (isEmpty()) {
            System.out.println("Queue is empty.");
            return;
        }

        if (stack2.isEmpty()) {
            while (!stack1.isEmpty()) {
                stack2.push(stack1.pop());
            }
        }

        System.out.print("Queue (front to rear): ");
        stack2.display();
    }

    public static void main(String[] args) {
        TwoStackQueue queue = new TwoStackQueue(5);
        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);

        queue.display();

        System.out.println("Dequeued element: " + queue.dequeue());
        System.out.println("Peeked element: " + queue.peek());

        queue.display();
    }
}
