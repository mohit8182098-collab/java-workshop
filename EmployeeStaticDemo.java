// class EmployeeStaticDemo {

    static String company = "ABC Company";
    int id;
    String name;

    EmployeeStaticDemo(int i, String n) {
        id = i;
        name = n;
    }

    void display() {
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Name: " + name);
        System.out.println("Company: " + company);
    }

    public static void main(String args[]) {
        EmployeeStaticDemo e1 = new EmployeeStaticDemo(101, "Mohit");
        EmployeeStaticDemo e2 = new EmployeeStaticDemo(102, "Rahul");

        e1.display();
        e2.display();
    }
}