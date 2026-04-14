import java.sql.Connection;
import java.sql.DriverManager;



public class DBConnectionDemo {
    public static void main(String[] srgs) {
        try {
            Class.forName("can.mysql.cj.jdbc.Driver");

            Connection con = DriverManager.getConnection(
                 "jdbc:mysql://localhost:3306/studentdb",
                 "root",
                 "password"

            );
            System.out.println("Database connected successfully!");

            con.close();

            
        }catch(Exception e){
            System.out.println("DB Connection error:" + e.getMessage());
        }
    }
    
}
