public class Main {
    public static void main(String[] args) {
        TaskManagementSystem tms = new TaskManagementSystem();

        Task t1 = new Task("T001", "Design UI", "In Progress");
        Task t2 = new Task("T002", "Develop Backend", "Not Started");
        Task t3 = new Task("T003", "Test Application", "In Progress");

        tms.addTask(t1);
        tms.addTask(t2);
        tms.addTask(t3);

        System.out.println("All Tasks:");
        tms.traverseTasks();

        System.out.println("\nSearching for Task with ID T002:");
        Task foundTask = tms.searchTask("T002");
        if (foundTask != null) {
            System.out.println(foundTask);
        } else {
            System.out.println("Task not found.");
        }

        System.out.println("\nDeleting Task with ID T002:");
        tms.deleteTask("T002");
        tms.traverseTasks();
    }
}
