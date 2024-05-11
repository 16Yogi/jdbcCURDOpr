package fun_a;
import java.sql.*;
public class fun1 {
    public void funa(){
        String url = "jdbc:mysql://localhost:3306/db1";
        String username = "root";
        String password = "123456";

        try{
            Class.forName("con.mysql.jdbc.Driver");
            System.out.println("Driver");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
        }

        try{
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection");
        }catch (SQLException e){
            System.out.println(e.getMessage());
        }
    }
}
