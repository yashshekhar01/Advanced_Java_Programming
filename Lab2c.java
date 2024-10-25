// Base class User
class User {
    int id;
    String name;

    // Parameterized constructor to initialize id and name
    public User(int id, String name) {
        this.id = id;
        this.name = name;
    }
}

// Subclass Employee inherits from User
class Employee extends User {
    double salary; // Monthly salary

    // Constructor to initialize id, name, and salary
    public Employee(int id, String name, double salary) {
        super(id, name); // Call the constructor of the base class User
        this.salary = salary;
    }

    // Method to calculate annual salary
    public double calculateAnnualSalary() {
        return salary * 12; // Annual salary is 12 times the monthly salary
    }
}

public class Main {
    public static void main(String[] args) {
        // Create an Employee object
        Employee emp = new Employee(101, "John Doe", 5000.0);

        // Calculate and display the annual salary
        double annualSalary = emp.calculateAnnualSalary();
        System.out.println("Employee Name: " + emp.name);
        System.out.println("Employee ID: " + emp.id);
        System.out.println("Annual Salary: " + annualSalary);
    }
}


