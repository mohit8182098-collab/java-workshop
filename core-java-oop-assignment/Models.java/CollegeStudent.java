// ================= Parent Class =================

// Common Student class
class Student {

    String name;      // variable to store student's name
    String comments;  // variable to store student's comments

    // Constructor to initialize Student data
    Student(String name, String comments) {
        this.name = name;         // assign name value
        this.comments = comments; // assign comments value
    }

    // Method to display student details
    void showDetails() {
        System.out.println("Name: " + name);
        System.out.println("Comments: " + comments);
    }
}


// ================= Child Class =================

// CollegeStudent class inherits Student class
class CollegeStudent extends Student {

    String college; // variable to store college name
    String course;  // variable to store course name

    // Constructor of child class
    CollegeStudent(String name, String comments, String college, String course) {

        super(name, comments); // call parent class constructor

        this.college = college; // assign college value
        this.course = course;   // assign course value
    }

    // Method overriding: redefining showDetails() method
    void showDetails() {

        super.showDetails(); // call parent class method

        // display additional details of child class
        System.out.println("College: " + college);
        System.out.println("Course: " + course);
    }


    // ================= Main Method =================
    public static void main(String[] args) {

        // Creating object of parent class
        Student s1 = new Student("Satyam", "Good in maths");

        // Creating object of child class
        CollegeStudent s2 = new CollegeStudent(
                "Mohit Gupta",
                "Active in coding",
                "Greater Noida College",
                "B.Tech"
        );

        // Display parent class details
        System.out.println("General Student:");
        s1.showDetails();

        // Display child class details
        System.out.println("\nCollege Student:");
        s2.showDetails();
    }
}

