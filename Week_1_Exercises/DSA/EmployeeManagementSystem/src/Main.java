public class Main {
    public static void main(String[] args) {
        EmployeeManagementSystem ems = new EmployeeManagementSystem(5);

        Employee e1 = new Employee("E001", "Alice", "Manager", 75000);
        Employee e2 = new Employee("E002", "Bob", "Developer", 60000);
        Employee e3 = new Employee("E003", "Charlie", "Designer", 50000);

        ems.addEmployee(e1);
        ems.addEmployee(e2);
        ems.addEmployee(e3);

        System.out.println("All Employees:");
        ems.traverseEmployees();

        System.out.println("\nSearching for Employee with ID E002:");
        Employee foundEmployee = ems.searchEmployee("E002");
        if (foundEmployee != null) {
            System.out.println(foundEmployee);
        } else {
            System.out.println("Employee not found.");
        }

        System.out.println("\nDeleting Employee with ID E002:");
        ems.deleteEmployee("E002");
        ems.traverseEmployees();
    }
}
