import java.util.Arrays;

public class LinearQueue {
    private int[] queue;
    private int front, rear, capacity;

    public LinearQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = rear = -1;
    }

    public void enqueue(int item) {
        if (rear == capacity - 1) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1)
            front = 0;
        queue[++rear] = item;
    }

    public int dequeue() {
        if (front == -1 || front > rear) {
            System.out.println("Queue is empty");
            return -1;
        }
        return queue[front++];
    }

    public void display() {
        if (front == -1)
            System.out.println("Queue is empty");
        else {
            for (int i = front; i <= rear; i++)
                System.out.print(queue[i] + " ");
            System.out.println();
        }
    }

    public static void main(String[] args) {
        LinearQueue queue = new LinearQueue(5);

        queue.enqueue(10);
        queue.enqueue(20);
        queue.enqueue(30);
        queue.enqueue(40);
        queue.enqueue(50);

        queue.display(); // Output: 10 20 30 40 50

        System.out.println("Dequeued element: " + queue.dequeue()); // Output: Dequeued element: 10

        queue.display(); // Output: 20 30 40 50
    }
}