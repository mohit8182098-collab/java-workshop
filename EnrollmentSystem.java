import java.util.*;

// Course Class
class Course {
    int courseId;
    String courseName;
    double fee;

    Course(int courseId, String courseName, double fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.fee = fee;
    }

    public String toString() {
        return courseId + " - " + courseName + " - " + fee;
    }
}

// Student Class
class Student {
    int studentId;
    String name;

    // A student can enroll in multiple courses
    ArrayList<Course> courses = new ArrayList<>();

    Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    // Enroll in course
    void enrollCourse(Course c) {
        courses.add(c);
    }

    // Display student details
    void display() {
        System.out.println("Student ID: " + studentId);
        System.out.println("Name: " + name);
        System.out.println("Enrolled Courses:");
        
        for (Course c : courses) {
            System.out.println("  " + c);
        }
    }
}

// Main Class
public class EnrollmentSystem {
    public static void main(String[] args) {

        // Create Courses
        Course c1 = new Course(101, "Java", 5000);
        Course c2 = new Course(102, "Python", 4000);
        Course c3 = new Course(103, "DBMS", 3000);

        // Create Student
        Student s1 = new Student(1, "Mohit Gupta");

        // Enroll in multiple courses
        s1.enrollCourse(c1);
        s1.enrollCourse(c2);
        s1.enrollCourse(c3);

        // Display Details
        s1.display();
    }
}