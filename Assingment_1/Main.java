package Assingment_1;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Create a ToDoList instance
        ToDoList toDoList = new ToDoList();

        // Add tasks based on user input
        System.out.println("Enter the tasks for your to-do list (or type 'exit' to finish):");
        while (true) {
            System.out.print("Task title: ");
            String title = scanner.nextLine();
            if (title.equalsIgnoreCase("exit")) {
                break;
            }

            System.out.print("Task description: ");
            String description = scanner.nextLine();

            toDoList.addToDo(new Task(title, description));
        }

        // Mark a task as completed
        System.out.print("Enter the title of the task to mark as completed: ");
        String completedTaskTitle = scanner.nextLine();
        toDoList.markToDoAsCompleted(completedTaskTitle);

        // View the to-do list
        System.out.println("\nYour to-do list:");
        toDoList.viewToDoList();

        scanner.close();
    }
}

