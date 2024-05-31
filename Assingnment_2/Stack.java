package Assingnment_2;

class Stack {
    private LinkedList list;

    public Stack() {
        list = new LinkedList();
    }

    // Method to push an element onto the stack
    public void push(int data) {
        list.insertAtPos(data, 1);
    }

    // Method to pop an element from the stack
    public int pop() {
        if (list.head == null) {
            throw new IllegalStateException("Stack is empty");
        }
        int topData = list.head.data;
        list.deleteAtPosition(1);
        return topData;
    }

    // Method to peek at the top element of the stack
    public int peek() {
        if (list.head == null) {
            throw new IllegalStateException("Stack is empty");
        }
        return list.head.data;
    }
}
