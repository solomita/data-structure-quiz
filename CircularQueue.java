public class CircularQueue {
    private int[] queue;
    private int front, rear, capacity;

    public CircularQueue(int size) {
        capacity = size;
        queue = new int[capacity];
        front = rear = -1;
    }

    public void enqueue(int item) {
        if ((rear + 1) % capacity == front) {
            System.out.println("Queue is full");
            return;
        }
        if (front == -1)
            front = 0;
        rear = (rear + 1) % capacity;
        queue[rear] = item;
    }

    public int dequeue() {
        if (front == -1) {
            System.out.println("Queue is empty");
            return -1;
        }
        int item = queue[front];
        if (front == rear)
            front = rear = -1;
        else
            front = (front + 1) % capacity;
        return item;
    }

    public void display() {
        if (front == -1)
            System.out.println("Queue is empty");
        else {
            int i = front;
            do {
                System.out.print(queue[i] + " ");
                i = (i + 1) % capacity;
            } while (i != (rear + 1) % capacity);
            System.out.println();
        }
    }

    public static void main(String[] args) {
        CircularQueue queue = new CircularQueue(5);

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
