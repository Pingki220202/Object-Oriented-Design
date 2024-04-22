/**
 * This class defines a basic Employee entity.
 */
class Employee {
    private String name; // Stores the name of the employee.
    private double salary; // Represents the salary of the employee.

    /**
     * Constructs a new Employee instance with the specified name and salary.
     *
     * @param name   The name of the employee.
     * @param salary The salary of the employee.
     */
    public Employee(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    /**
     * Retrieves the name of the employee.
     *
     * @return The name of the employee.
     */
    public String getName() {
        return name;
    }

    /**
     * Retrieves the salary of the employee.
     *
     * @return The salary of the employee.
     */
    public double getSalary() {
        return salary;
    }
}

/**
 * This class represents a basic Employee Management System.
 */
class EmployeeManagementSystem {

    /**
     * Displays the details of an employee.
     *
     * @param employee The employee to display details for.
     */
    public void displayEmployeeDetails(Employee employee) {
        System.out.println("Employee Details:");
        System.out.println("Name: " + employee.getName());
        System.out.println("Salary: $" + employee.getSalary());
    }
}

/**
 * This class demonstrates the usage of Employee and EmployeeManagementSystem classes.
 */
class EmployeeDemo {
    public static void main(String[] args) {
        // Create an employee
        Employee employee = new Employee("John Doe", 50000.0);

        // Manage employees using EmployeeManagementSystem
        EmployeeManagementSystem ems = new EmployeeManagementSystem();

        // Display employee details using EmployeeManagementSystem
        ems.displayEmployeeDetails(employee);
    }
}

/**
 * In the provided code, the responsibility of printing the employee details is delegated to the EmployeeManagementSystem class,
 * allowing the Employee class to solely focus on storing the attributes of an employee.
 */
