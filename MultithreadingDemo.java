import java.util.*;

// Custom Exception
class EnrollmentException extends Exception {
    EnrollmentException(String msg) {
        super(msg);
    }
}

// Student class
class Student {
    int id;
    String name;

    Student(int id, String name) throws EnrollmentException {
        if (id <= 0)
            throw new EnrollmentException("Student ID must be positive");
        if (name == null || name.isEmpty())
            throw new EnrollmentException("Name cannot be empty");

        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

// Course class
class Course {
    int courseId;
    String courseName;

    Course(int courseId, String courseName) {
        this.courseId = courseId;
        this.courseName = courseName;
    }
}

// Enrollment Thread
class EnrollmentThread extends Thread {
    Student student;
    Course course;

    EnrollmentThread(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public void run() {
        try {
            System.out.println(Thread.currentThread().getName() +
                    ": Processing enrollment for " + student.name +
                    " in " + course.courseName);

            Thread.sleep(2000);

            System.out.println(Thread.currentThread().getName() +
                    ": Enrollment completed: " + student.name +
                    " -> " + course.courseName);

        } catch (InterruptedException e) {
            System.out.println("Enrollment interrupted");
        }
    }
}

// Main class
public class MultithreadingDemo {
    public static void main(String[] args) {
        try {
            Student s1 = new Student(1, "Mohit Gupta");
            Student s2 = new Student(2, "Amit");

            Course c1 = new Course(101, "Java");
            Course c2 = new Course(102, "Python");

            EnrollmentThread t1 = new EnrollmentThread(s1, c1);
            EnrollmentThread t2 = new EnrollmentThread(s2, c2);

            t1.setName("Thread-1");
            t2.setName("Thread-2");

            t1.start();
            t2.start();

            t1.join();
            t2.join();

            System.out.println("All enrollments processed.");

        } catch (EnrollmentException e) {
            System.out.println(e.getMessage());
        } catch (InterruptedException e) {
            System.out.println("Main thread interrupted");
        }
    }
}