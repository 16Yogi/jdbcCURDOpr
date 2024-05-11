package deldata;
import java.sql.*;
public class deletedata {
    public void deldata(){
        String url = "jdbc:mysql://localhost:3306/db1";
        String username = "root";
        String password ="123456";
        String query = "DELETE FROM login WHERE id=55";

//        driver loading
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded successfully");
        }catch (ClassNotFoundException e){
            System.out.println("Fuck you bsdk");
            System.out.println(e.getMessage());
        }

//        execution
        try{
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection ready for ");
            Statement stmt = con.createStatement();

            int rowsaffected = stmt.executeUpdate(query);

            if(rowsaffected>0){
                System.out.println("Deletion successful"+ rowsaffected+"rows(s) affected.");
            }else{
                System.out.println("Fuck you baby");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Chala ja bsdk");
        }
    }
}
