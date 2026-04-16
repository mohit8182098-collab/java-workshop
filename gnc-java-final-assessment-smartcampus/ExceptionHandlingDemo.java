import java.util.*;

// Custom Exception Class
class InvalidDataException extends Exception {
    public InvalidDataException(String message) {
        super(message);
    }
}

class Student {
    int id;
    String name;

    Student(int id, String name) throws InvalidDataException {
        if (id <= 0) {
            throw new InvalidDataException("Student ID must be positive!");
        }
        if (name == null || name.isEmpty()) {
            throw new InvalidDataException("Name cannot be empty!");
        }
        this.id = id;
        this.name = name;
    }

    public String toString() {
        return id + " - " + name;
    }
}

public class ExceptionHandlingDemo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        try {
            System.out.print("Enter Student ID: ");
            int id = sc.nextInt();   

            sc.nextLine(); // consume newline

            System.out.print("Enter Name: ");
            String name = sc.nextLine();

            Student s = new Student(id, name);
            System.out.println("Student Created: " + s);

        } 
        catch (InputMismatchException e) {
            System.out.println("Invalid input! Please enter a number for ID.");
        } 
        catch (InvalidDataException e) {
            System.out.println("Custom Exception: " + e.getMessage());
        } 
        catch (Exception e) {
            System.out.println("Something went wrong: " + e);
        } 
        finally {
            System.out.println("Program finished.");
            sc.close();
        }
    }
}