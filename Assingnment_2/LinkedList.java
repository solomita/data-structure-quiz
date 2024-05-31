package Assingnment_2;

class LinkedList {
    Node head;

    public LinkedList() {
        this.head = null;
    }

    // Method to insert a node at a specified position
    public void insertAtPos(int data, int position) {
        Node newNode = new Node(data);
        if (position == 1) {
            newNode.next = head;
            head = newNode;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            if (current == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            current = current.next;
        }
        newNode.next = current.next;
        current.next = newNode;
    }

    // Method to delete a node at a specified position
    public void deleteAtPosition(int position) {
        if (head == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        if (position == 1) {
            head = head.next;
            return;
        }
        Node current = head;
        for (int i = 1; i < position - 1; i++) {
            if (current.next == null) {
                throw new IndexOutOfBoundsException("Position out of bounds");
            }
            current = current.next;
        }
        if (current.next == null) {
            throw new IndexOutOfBoundsException("Position out of bounds");
        }
        current.next = current.next.next;
    }

    // Method to delete the node after a given node
    public void deleteAfterNode(Node prevNode) {
        if (prevNode == null || prevNode.next == null) {
            throw new IllegalArgumentException("Node does not exist");
        }
        prevNode.next = prevNode.next.next;
    }

    // Method to search for a node with a specific value
    public boolean searchNode(int data) {
        Node current = head;
        while (current != null) {
            if (current.data == data) {
                return true;
            }
            current = current.next;
        }
        return false;
    }
}
