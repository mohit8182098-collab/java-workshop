// ================= Student Class =================
class Student {
    int rollNo;     // variable to store roll number
    String name;    // variable to store student name
    int marks;      // variable to store marks

    // Method to display student details
    void display() {
        System.out.println("Roll No: " + rollNo);
        System.out.println("Name: " + name);
        System.out.println("Marks: " + marks);
    }

    // Method to perform string operations on name
    void nameFormat() {
        System.out.println("Uppercase: " + name.toUpperCase()); // convert to uppercase
        System.out.println("Lowercase: " + name.toLowerCase()); // convert to lowercase
        System.out.println("Length: " + name.length());         // get length of string
    }
}


// ================= Employee Class =================
class Employee {
    int id;          // employee ID
    String name;     // employee name
    double salary;   // employee salary

    // Constructor to initialize employee details
    Employee(int id, String name, double salary) {
        this.id = id;         // assign value to id
        this.name = name;     // assign value to name
        this.salary = salary; // assign value to salary
    }

    // Method to display employee details
    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Salary: " + salary);
    }
}


// ================= Product Class (Encapsulation) =================
class Product {
    private int id;        // private variable (data hiding)
    private String name;   // private variable
    private double price; // private variable

    // Setter method to set product details
    void setProduct(int id, String name, double price) {
        this.id = id;
        this.name = name;
        this.price = price;
    }

    // Getter method to display product details
    void getProduct() {
        System.out.println("Product ID: " + id);
        System.out.println("Product Name: " + name);
        System.out.println("Price: " + price);
    }
}


// ================= ProductBilling Class (Method Overloading) =================
class ProductBilling {

    // Method with one parameter
    void bill(int a) {
        System.out.println("Total Bill (1 product): " + a);
    }

    // Method with two parameters (overloaded method)
    void bill(int a, int b) {
        System.out.println("Total Bill (2 products): " + (a + b));
    }

    // Method with three parameters (overloaded method)
    void bill(int a, int b, int c) {
        System.out.println("Total Bill (3 products): " + (a + b + c));
    }
}


// ================= Inheritance Section =================

// Parent/Base class
class StudentBase {
    String name;        // student's name
    String comments;    // student's comments

    // Constructor to initialize base class variables
    StudentBase(String name, String comments) {
        this.name = name;
        this.comments = comments;
    }

    // Method to display base student details
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Comments: " + comments);
    }
}

// Child class inheriting from StudentBase
class CollegeStudent extends StudentBase {
    String college;   // college name
    String course;    // course name

    // Constructor using super keyword to call parent constructor
    CollegeStudent(String name, String comments, String college, String course) {
        super(name, comments);  // calling parent class constructor
        this.college = college;
        this.course = course;
    }

    // Overriding method to display full details
    void showDetails() {
        super.showDetails();  // call parent method
        System.out.println("College: " + college);
        System.out.println("Course: " + course);
    }
}


// ================= Main Class =================
public class Main {

    public static void main(String[] args) {

        // ===== 1. Student Object =====
        System.out.println("---- Student Details ----");

        Student s = new Student();  // create Student object
        s.rollNo = 1;               // assign roll number
        s.name = "Mohit Gupta";          // assign name
        s.marks = 95;               // assign marks

        s.display();                // call display method

        System.out.println("\n---- Name Formatting ----");
        s.nameFormat();             // call string operations method


        // ===== 2. Array Example =====
        System.out.println("\n---- Marks Array ----");

        int marks[] = {70, 80, 90, 85, 75}; // declare and initialize array

        // loop to print array elements
        for (int i = 0; i < marks.length; i++) {
            System.out.println(marks[i]);
        }


        // ===== 3. Employee Object =====
        System.out.println("\n---- Employee Details ----");

        Employee e = new Employee(101, "Rahul", 25000); // create object using constructor
        e.display();                                    // call display method


        // ===== 4. Product Object (Encapsulation) =====
        System.out.println("\n---- Product Details ----");

        Product p = new Product();               // create object
        p.setProduct(250, "Laptop", 68200);     // set values using setter
        p.getProduct();                         // get values using getter


        // ===== 5. Method Overloading =====
        System.out.println("\n---- Billing ----");

        ProductBilling pb = new ProductBilling(); // create object
        pb.bill(100);                             // call method with 1 argument
        pb.bill(100, 200);                        // call method with 2 arguments
        pb.bill(100, 200, 300);                   // call method with 3 arguments


        // ===== 6. Inheritance Example =====
        System.out.println("\n---- Inheritance Example ----");

        // create base class object
        StudentBase s1 = new StudentBase("Satyam", "Good in maths");

        // create child class object
        CollegeStudent s2 = new CollegeStudent(
                "Mohit Gupta",
                "Active in coding",
                "Greater Noida College",
                "B.Tech"
        );

        System.out.println("General Student:");
        s1.showDetails();   // call base class method

        System.out.println("\nCollege Student:");
        s2.showDetails();   // call overridden method
    }
}

