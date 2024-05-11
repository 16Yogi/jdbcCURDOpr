package updatadb;
import java.sql.*;
public class updatedata {
    public void updatefun(){
        String url = "jdbc:mysql://localhost:3306/db1";
        String username = "root";
        String password = "123456";
        String qry = "UPDATE login SET username ='halla_bol' WHERE id=5;";

        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Driver loaded baby");
        }catch (ClassNotFoundException e){
            System.out.println(e.getMessage());
            System.out.println("Driver not loaded baby");
        }


        try{
            Connection con = DriverManager.getConnection(url,username,password);
            System.out.println("Connection ready baby");
            Statement stmt = con.createStatement();

            int rowsaffected = stmt.executeUpdate(qry);

            if(rowsaffected>0){
                System.out.println("Data updated baby"+rowsaffected+"row(s) affected");
            }else{
                System.out.println("Updation Failed baby");
            }
        }catch (SQLException e){
            System.out.println(e.getMessage());
            System.out.println("Chala jata hu kisi ke dil m");
        }
    }
}
