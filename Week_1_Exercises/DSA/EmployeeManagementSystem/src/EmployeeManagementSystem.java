public class EmployeeManagementSystem {
    private Employee[] employees;
    private int count;

    public EmployeeManagementSystem(int size) {
        employees = new Employee[size];
        count = 0;
    }

    // Add an employee
    public void addEmployee(Employee employee) {
        if (count < employees.length) {
            employees[count] = employee;
            count++;
        } else {
            System.out.println("Employee array is full.");
        }
    }

    // Search for an employee by employeeId
    public Employee searchEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                return employees[i];
            }
        }
        return null;
    }

    // Traverse and display all employees
    public void traverseEmployees() {
        for (int i = 0; i < count; i++) {
            System.out.println(employees[i]);
        }
    }

    // Delete an employee by employeeId
    public void deleteEmployee(String employeeId) {
        for (int i = 0; i < count; i++) {
            if (employees[i].getEmployeeId().equals(employeeId)) {
                // Shift remaining employees to the left
                for (int j = i; j < count - 1; j++) {
                    employees[j] = employees[j + 1];
                }
                employees[count - 1] = null; // Optional: clear the last element
                count--;
                return;
            }
        }
        System.out.println("Employee not found.");
    }
}
