import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        ToDoList todoList = new ToDoList();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("ToDo List Menu:");
            System.out.println("1. Add Task");
            System.out.println("2. Remove Task");
            System.out.println("3. Mark Task as Complete");
            System.out.println("4. Display Tasks");
            System.out.println("5. Exit");
            System.out.print("Enter your choice: ");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Consume the newline character

            switch (choice) {
                case 1:
                    System.out.print("Enter task name: ");
                    String taskName = scanner.nextLine();
                    todoList.addTask(taskName);
                    break;
                case 2:
                    System.out.print("Enter task index to remove: ");
                    int removeIndex = scanner.nextInt();
                    todoList.removeTask(removeIndex);
                    break;
                case 3:
                    System.out.print("Enter task index to mark as complete: ");
                    int completeIndex = scanner.nextInt();
                    todoList.markTaskComplete(completeIndex);
                    break;
                case 4:
                    todoList.displayTasks();
                    break;
                case 5:
                    System.out.println("Goodbye!");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
