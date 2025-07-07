package javaassignment3;


public class Employee {
    // Attributes
    private int id;
    private String firstName;
    private String lastName;
    private int salary;

    // Constructor
    public Employee(int id, String firstName, String lastName, int salary) {
        this.id = id;
        this.firstName = firstName;
        this.lastName = lastName;
        this.salary = salary;
    }

    // Getter for ID
    public int getID() {
        return id;
    }

    // Getter for firstName
    public String getFirstName() {
        return firstName;
    }

    // Getter for lastName
    public String getLastName() {
        return lastName;
    }

    // Getter for full name
    public String getName() {
        return firstName + " " + lastName;
    }

    // Getter for salary
    public int getSalary() {
        return salary;
    }

    // Setter for salary
    public void setSalary(int salary) {
        this.salary = salary;
    }

    // Get annual salary
    public int getAnnualSalary() {
        return salary * 12;
    }

    // Raise salary by percent and return new salary
    public int raiseSalary(int percent) {
        salary += salary * percent / 100;
        return salary;
    }

    // toString method
    @Override
    public String toString() {
        return "Employee[id=" + id + ", name=" + getName() + ", salary=" + salary + "]";
    }

    // Main method to test the Employee class
    public static void main(String[] args) {
        Employee emp = new Employee(1, "John", "Doe", 5000);
        System.out.println(emp); // toString()

        System.out.println("ID: " + emp.getID());
        System.out.println("First Name: " + emp.getFirstName());
        System.out.println("Last Name: " + emp.getLastName());
        System.out.println("Full Name: " + emp.getName());
        System.out.println("Salary: " + emp.getSalary());
        System.out.println("Annual Salary: " + emp.getAnnualSalary());

        emp.raiseSalary(10);
        System.out.println("New Salary after 10% raise: " + emp.getSalary());
       
    }
}

