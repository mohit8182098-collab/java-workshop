public class StudendMarksArray {
    public static void main(String[] args) {
        int[] marks = {85, 92, 78, 90, 88, 87,39, 95, 99, 100};//create an array to store student marks
        
        System.out.println("Student Marks:");//print the marks
        for (int i = 0; i < marks.length; i++) {//use for to access each element of the array
            System.out.print("Student " + (i + 1) + "Marks=" + marks[i]);//print the marks with space
        }
    }
    
}
