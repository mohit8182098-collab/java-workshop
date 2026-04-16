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

    Student(int studentId, String name) {
        this.studentId = studentId;
        this.name = name;
    }

    public String toString() {
        return studentId + " - " + name;
    }
}

// Enrollment Class
class Enrollment {
    Student student;
    Course course;

    Enrollment(Student student, Course course) {
        this.student = student;
        this.course = course;
    }

    public String toString() {
        return student.name + " enrolled in " + course.courseName;
    }
}

// Thread Class
class EnrollmentThread extends Thread {
    ArrayList<Enrollment> enrollments;

    EnrollmentThread(ArrayList<Enrollment> enrollments) {
        this.enrollments = enrollments;
    }

    public void run() {
        System.out.println("\nProcessing Enrollments...");
        for (Enrollment e : enrollments) {
            try {
                Thread.sleep(1000); // delay
                System.out.println("Processed: " + e);
            } catch (Exception ex) {
                System.out.println("Error");
            }
        }
        System.out.println("All Enrollments Processed!");
    }
}

// Main Class
public class EnrollmentSys {

    static HashMap<Integer, Student> students = new HashMap<>();
    static HashMap<Integer, Course> courses = new HashMap<>();
    static ArrayList<Enrollment> enrollments = new ArrayList<>();

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {
            System.out.println("\n===== MENU =====");
            System.out.println("1. Add Student");
            System.out.println("2. Add Course");
            System.out.println("3. Enroll Student");
            System.out.println("4. View Students");
            System.out.println("5. View Enrollments");
            System.out.println("6. Process Enrollment (Thread)");
            System.out.println("7. Exit");

            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1: // Add Student
                    System.out.print("Enter Student ID: ");
                    int sid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Name: ");
                    String name = sc.nextLine();

                    students.put(sid, new Student(sid, name));
                    System.out.println("Student Added!");
                    break;

                case 2: // Add Course
                    System.out.print("Enter Course ID: ");
                    int cid = sc.nextInt();
                    sc.nextLine();
                    System.out.print("Enter Course Name: ");
                    String cname = sc.nextLine();
                    System.out.print("Enter Fee: ");
                    double fee = sc.nextDouble();

                    courses.put(cid, new Course(cid, cname, fee));
                    System.out.println("Course Added!");
                    break;

                case 3: // Enroll Student
                    System.out.print("Enter Student ID: ");
                    sid = sc.nextInt();
                    System.out.print("Enter Course ID: ");
                    cid = sc.nextInt();

                    Student s = students.get(sid);
                    Course c = courses.get(cid);

                    if (s != null && c != null) {
                        enrollments.add(new Enrollment(s, c));
                        System.out.println("Enrollment Successful!");
                    } else {
                        System.out.println("Invalid ID!");
                    }
                    break;

                case 4: // View Students
                    if (students.isEmpty()) {
                        System.out.println("No Students Found!");
                    } else {
                        for (Student st : students.values()) {
                            System.out.println(st);
                        }
                    }
                    break;

                case 5: // View Enrollments
                    if (enrollments.isEmpty()) {
                        System.out.println("No Enrollments Found!");
                    } else {
                        for (Enrollment e : enrollments) {
                            System.out.println(e);
                        }
                    }
                    break;

                case 6: // Thread Processing
                    EnrollmentThread t = new EnrollmentThread(enrollments);
                    t.start();
                    break;

                case 7:
                    System.out.println("Exiting Program...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Choice!");
            }
        }
    }
}