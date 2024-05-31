package Assingment_1;

public class ToDoList {
    private Node head;

    public void addToDo(Task task) {
        Node newNode = new Node(task);
        if (head == null) {
            head = newNode;
        } else {
            Node current = head;
            while (current.getNext() != null) {
                current = current.getNext();
            }
            current.setNext(newNode);
        }
    }

    public void markToDoAsCompleted(String title) {
        Node current = head;
        while (current != null) {
            if (current.getTask().getTitle().equals(title)) {
                current.getTask().markCompleted();
                return;
            }
            current = current.getNext();
        }
    }

    public void viewToDoList() {
        Node current = head;
        while (current != null) {
            Task task = current.getTask();
            System.out.println("Title: " + task.getTitle());
            System.out.println("Description: " + task.getDescription());
            System.out.println("Completed: " + task.isCompleted());
            System.out.println("--------------------");
            current = current.getNext();
        }
    }
}
