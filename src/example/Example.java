
package example;

import java.sql.*;


public class Example {
private static final String USERNAME="root";
private static final String PASSWORD ="admin";
private static final String CONN_STRING="jdbc:mysql://localhost:3306/Example";
    public static void main(String[] args) {
        Connection conn=null;
        try{
            conn=DriverManager.getConnection(CONN_STRING,USERNAME,PASSWORD);
            System.out.println("Connected!");
            Statement stmt=(Statement) conn.createStatement();
            String Fname="Jame";
            String Lname="Brown";
            String insert="Insert into user values('"+Fname+"','"+Lname+"')";
            stmt.executeUpdate(insert);
        }
        catch(SQLException e)
        {
            System.out.println(e);
        }
      
    }
    
}
