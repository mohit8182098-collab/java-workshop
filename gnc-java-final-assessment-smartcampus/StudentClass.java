
// class StudentClass {
//     private int studentId;
//     private String name;
//     private String email;

//     // Constructor
//     public Student(int studentId, String name, String email) {
//         this.studentId = studentId;
//         this.name = name;
//         this.email = email;
//     }

//     // Getters
//     public int getStudentId() {
//         return studentId;
//     }

//     public String getName() {
//         return name;
//     }

//     public String getEmail() {
//         return email;
//     }

//     // Display method
//     public void display() {
//         System.out.println("ID: " + studentId);
//         System.out.println("Name: " + name);
//         System.out.println("Email: " + email);
//     }

//     // toString method (useful for printing)
//     public String toString() {
//         return studentId + " - " + name + " - " + email;
//     }
// }
class StudentClass {
    int studentId;
    String name;
    String email;

    public StudentClass(int studentId, String name, String email) {
        this.studentId = studentId;
        this.name = name;
        this.email = email;
    }

    public String toString() {
        return studentId + " - " + name + " - " + email;
    }

    public static void main(String[] args) {
        StudentClass s1 = new StudentClass(1, "Mohit", "mohit@gmail.com");
        System.out.println(s1);
    }
}