
import java.sql.*;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class ConnectionProvider {
    public static Connection getCon(){
      try{
          Class.forName("com.mysql.cj.jdbc.Driver");
          Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/Pjt","root","admin");
          return con;
      }  
      catch(Exception e)
      {
          return null;
      }
    }
    
}
