import java.io.*;

public class FileHandlingDemo {

    // Method to save data
    public static void saveData() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt"));

            bw.write("101,Mohit Gupta");
            bw.newLine();
            bw.write("102,Rohit Sharma");
            bw.newLine();
            bw.write("103,Amit");

            bw.close();
            System.out.println("Data saved successfully!");

        } catch (IOException e) {
            System.out.println("Error while saving: " + e.getMessage());
        }
    }

    // Method to read data
    public static void readData() {
        try {
            BufferedReader br = new BufferedReader(new FileReader("data.txt"));

            String line;
            System.out.println("\nReading Data:");

            while ((line = br.readLine()) != null) {
                String[] parts = line.split(",");
                System.out.println("ID: " + parts[0] + ", Name: " + parts[1]);
            }

            br.close();

        } catch (IOException e) {
            System.out.println("Error while reading: " + e.getMessage());
        }
    }

    public static void main(String[] args) {
        saveData();   // Write to file
        readData();   // Read from file
    }
}