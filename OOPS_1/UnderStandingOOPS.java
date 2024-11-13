// Importing packages
import java.util.*;

// Interface for task handling
interface TaskHandler {
    void doTask();
}

// Superclass: Person
class Person {
    // Fields, demonstrating encapsulation
    private String name;
    private int age;

    // Constructor
    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // Getter method (Encapsulation)
    public String getName() {
        return name;
    }

    // Method to display age
    public void showAge() {
        System.out.println("Age: " + age);
    }
}

// Subclass: Employee inherits from Person
class Employee extends Person implements TaskHandler {
    // Static field to keep track of employee count
    private static int employeeCount = 0;

    // Private field for salary (Encapsulation)
    private double salary;

    // Constructor
    public Employee(String name, int age, double salary) {
        super(name, age);
        this.salary = salary;
        employeeCount++;
    }

    // Getter for salary
    public double getSalary() {
        return salary;
    }

    // Static method to get total employees
    public static int getEmployeeCount() {
        return employeeCount;
    }

    // Method overloading
    public void raiseSalary(double amount) throws Exception {
        if (amount < 0) throw new Exception("Raise amount must be positive.");
        salary += amount;
    }

    public void raiseSalary(double amount, double bonus) throws Exception {
        if (amount + bonus < 0) throw new Exception("Raise and bonus must be positive.");
        salary += (amount + bonus);
    }

    // Polymorphic method
    public void work() {
        System.out.println(getName() + " is working.");
    }

    // Implementing interface method
    public void doTask() {
        System.out.println(getName() + " is handling a task.");
    }
}

// Subclass: Manager, extending Employee
class Manager extends Employee {
    private String department;

    // Constructor with 'super' keyword
    public Manager(String name, int age, double salary, String department) {
        super(name, age, salary); // Calls the superclass constructor
        this.department = department;
    }

    // Overriding work method
    @Override
    public void work() {
        System.out.println(getName() + " is managing the " + department + " department.");
    }

    // Using 'super' to call superclass methods
    public void printManagerInfo() {
        super.showAge();
        System.out.println("Department: " + department);
    }
}

// Main class - Demonstrating OOP concepts
public class UnderStandingOOPS {
    public static void main(String[] args) {
        System.out.println("This is to understand OOPS");

        // Creating objects of classes
        Employee employee1 = new Employee("John", 30, 5000);
        Manager manager = new Manager("Alice", 40, 8000, "Marketing");

        // Using encapsulation to access private fields
        System.out.println(employee1.getName() + " earns $" + employee1.getSalary());
        
        // Demonstrating inheritance and polymorphism
        employee1.work();
        manager.work(); // Overridden method in Manager class
        
        // Demonstrating use of 'super' and constructors
        manager.printManagerInfo();

        // Using static method and field
        System.out.println("Total employees: " + Employee.getEmployeeCount());

        // Interface example
        employee1.doTask();
        
        // Exception handling
        try {
            employee1.raiseSalary(-500); // Raises exception
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }

        // Array and ArrayList usage
        Employee[] employeeArray = {employee1, manager};
        ArrayList<Employee> employeeList = new ArrayList<>();
        employeeList.add(employee1);
        employeeList.add(manager);
        
        // Displaying employee names from ArrayList
        for(Employee emp : employeeList) {
            System.out.println(emp.getName());
        }
    }
}
