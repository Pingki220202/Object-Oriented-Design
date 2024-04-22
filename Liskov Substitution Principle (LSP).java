import java.util.ArrayList;
import java.util.List;

/**
 * Interface representing an employee.
 */
abstract class Employee {
    /**
     * Calculates the monthly salary of the employee.
     *
     * @return The monthly salary of the employee.
     */
    abstract double calculateMonthlySalary();
}

/**
 * Class representing a full-time employee.
 */
class FullTimeEmployee extends Employee {
    private double monthlySalary;

    /**
     * Constructs a new FullTimeEmployee object with the given monthly salary.
     *
     * @param monthlySalary The monthly salary of the full-time employee.
     */
    public FullTimeEmployee(double monthlySalary) {
        this.monthlySalary = monthlySalary;
    }

    @Override
    public double calculateMonthlySalary() {
        return monthlySalary;
    }
}

/**
 * Class representing a part-time employee, a special type of employee.
 */
class PartTimeEmployee extends Employee {
    private double hourlyRate;
    private double hoursWorked;

    /**
     * Constructs a new PartTimeEmployee object with the given hourly rate and hours worked.
     *
     * @param hourlyRate   The hourly rate of the part-time employee.
     * @param hoursWorked  The number of hours worked by the part-time employee.
     */
    public PartTimeEmployee(double hourlyRate, double hoursWorked) {
        this.hourlyRate = hourlyRate;
        this.hoursWorked = hoursWorked;
    }

    @Override
    public double calculateMonthlySalary() {
        // Assuming a fixed number of working hours per month
        int totalMonthlyHours = 160; // Assuming 160 hours in a month
        return hourlyRate * hoursWorked;
    }
}

/**
 * Demo class demonstrating the usage of employee types and the Liskov Substitution Principle.
 */
class Liskov_Substitution_Principle_Employees {
    /**
     * Calculates the average monthly salary of employees and prints it.
     *
     * @param employees The list of employees.
     */
    public static void calculateAverageMonthlySalary(List<Employee> employees) {
        double totalMonthlySalary = 0;
        for (Employee employee : employees) {
            totalMonthlySalary += employee.calculateMonthlySalary();
        }
        double averageMonthlySalary = totalMonthlySalary / employees.size();
        System.out.println("Average monthly salary of employees: $" + averageMonthlySalary);
    }

    public static void main(String[] args) {
        // Create a list of employees
        List<Employee> employees = new ArrayList<>();
        employees.add(new FullTimeEmployee(4000)); // Full-time employee with $4000 monthly salary
        employees.add(new PartTimeEmployee(20, 80)); // Part-time employee with $20 hourly rate and 80 hours worked

        // Calculate and print the average monthly salary of employees
        calculateAverageMonthlySalary(employees);
    }
}

/**
 * Despite being a subtype of Employee, the PartTimeEmployee class allows us to substitute
 * a PartTimeEmployee object for an Employee object without affecting the program's correctness.
 * This demonstrates adherence to the Liskov Substitution Principle.
 */
