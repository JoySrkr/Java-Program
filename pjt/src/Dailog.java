
import java.sql.*;


public class Dailog {
    public static void main(String [] args){
        Connection con=null;
        try{
            con=ConnectionProvider.getCon();
            Statement stmt=(Statement)con.createStatement();
            String Fname="Jame";
            String Lname="Brown";
            stmt.executeUpdate("insert into lame values('"+Fname+"','"+Lname+"')");
        }
        catch(Exception e){
            System.out.println(e);
            System.out.println("Catch Exception Occured");
        }
    }
}
