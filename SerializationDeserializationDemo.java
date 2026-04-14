// import java.io.*;

// class Student implements Serializable {
//     int id;
//     String name;
//     Student(int id, String name){
//         this.id = id;
//         this.name = name;

//     }
//     void display(){
//         System.out.println("ID:"+ id);
//         System.out.println("Name:" + name);
//     }
// }

// public class SerializationDeserializationDemo {
//     public static void main(String[] args) {
//         try {

//             Student s1 = new Student(101,"Rahul");
//             ObjectOutputStream oos = new ObjectOutputStream("Student.ser");

//             oos.writeObject(s1);
//             System.out.println("Object serialized successfully"\n );
//             System.out.println("Student data after deserialiation:");
//             s2.display();

//             ois.close();
//             fis.close();


        
//         }catch(IOException e){
//             System.out.println("File error:" +e);

//         }catch (ClassNotFoundException e){
//             System.out.println("Class error:" + e);

            
//         }

//     }
// }
import java.io.*;

class Student implements Serializable {
    int id;
    String name;

    Student(int id, String name){
        this.id = id;
        this.name = name;
    }

    void display(){
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
    }
}

public class SerializationDeserializationDemo {
    public static void main(String[] args) {
        try {
            // Serialization
            Student s1 = new Student(101, "Rahul");

            FileOutputStream fos = new FileOutputStream("Student.ser");
            ObjectOutputStream oos = new ObjectOutputStream(fos);

            oos.writeObject(s1);
            oos.close();
            fos.close();

            System.out.println("Object serialized successfully");

            // Deserialization
            FileInputStream fis = new FileInputStream("Student.ser");
            ObjectInputStream ois = new ObjectInputStream(fis);

            Student s2 = (Student) ois.readObject();

            System.out.println("Student data after deserialization:");
            s2.display();

            ois.close();
            fis.close();

        } catch(IOException e){
            System.out.println("File error: " + e);
        } catch (ClassNotFoundException e){
            System.out.println("Class error: " + e);
        }
    }
}