// Class to represent Employee details
class Employee {

    // Instance variables
    int empId;
    String empName;
    double salary;

    // Static variable (shared by all objects)
    static String companyName = "Gn Group Of Institute";

    // Constructor to initialize object values
    Employee(int id, String name, double sal) {
        empId = id;        // Assign employee ID
        empName = name;    // Assign employee name
        salary = sal;      // Assign salary
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + empId);
        System.out.println("Name: " + empName);
        System.out.println("Salary: " + salary);
        System.out.println("Company: " + companyName); // Static variable
    }

    public static void main(String[] args) {

        // Create object using constructor
        Employee e = new Employee(101, "Mohit Gupta", 25000);

        // Call display method
        e.display();
    }
}
