package Assingnment_2;

public class Main {
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();

        // Test insertAtPos method
        linkedList.insertAtPos(1, 1); // List: 1
        linkedList.insertAtPos(2, 2); // List: 1 -> 2
        linkedList.insertAtPos(3, 1); // List: 3 -> 1 -> 2
        linkedList.insertAtPos(4, 3); // List: 3 -> 1 -> 4 -> 2

        // Test deleteAtPosition method
        linkedList.deleteAtPosition(3); // List: 3 -> 1 -> 2
        linkedList.deleteAtPosition(1); // List: 1 -> 2

        // Test deleteAfterNode method
        linkedList.insertAtPos(3, 2); // List: 1 -> 3 -> 2
        linkedList.deleteAfterNode(linkedList.head); // List: 1 -> 2

        // Test searchNode method
        System.out.println(linkedList.searchNode(1)); // Output: true
        System.out.println(linkedList.searchNode(3)); // Output: false

        // Test Stack implementation
        Stack stack = new Stack();
        stack.push(10);
        stack.push(20);
        stack.push(30);
        System.out.println(stack.peek()); // Output: 30
        System.out.println(stack.pop());  // Output: 30
        System.out.println(stack.pop());  // Output: 20
        System.out.println(stack.peek()); // Output: 10
    }
}