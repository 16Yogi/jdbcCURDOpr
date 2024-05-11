package fun2;
import java.sql.*;
import com.mysql.cj.jdbc.exceptions.SQLExceptionsMapping;

public class insertdatafun {
    public void insertdata(){
//    public static void main(String[] args){
        String url = "jdbc:mysql://localhost:3306/db1";
        String username = "root";
        String password = "123456";
        String query = "INSERT INTO login(id,username,password) VALUES(5,'JDBC2','JDBC2')";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver successfully Loaded");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection successfully");
            Statement stmt = con.createStatement();

            int rowsaffected = stmt.executeUpdate(query);

            if(rowsaffected > 0){
                System.out.println("Insert successful"+rowsaffected + "row(s) affected");
            }else{
                System.out.println("Insertion failed");
            }

            stmt.close();
            con.close();
            System.out.println();
            System.out.println("Connection closed");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
