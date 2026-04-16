public class CourseManagement {
    int courseId;
    String courseName;
    double fee;

    // Correct Constructor
    public CourseManagement(int courseId, String courseName, double fee) {
        this.courseId = courseId;
        this.courseName = courseName;
        this.fee = fee;
    }

    // toString method
    public String toString() {
        return courseId + " - " + courseName + " - " + fee;
    }

    public static void main(String[] args) {
        CourseManagement c1 = new CourseManagement(101, "Java Programming", 5000.0);
        CourseManagement c2 = new CourseManagement(102, "Python Programming", 4000.0);

        System.out.println(c1);
        System.out.println(c2);
    }
}