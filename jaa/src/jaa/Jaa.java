/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package jaa;

import java.sql.*;


public class Jaa {

    public static void main(String[] args) {
       String url ="jdbc:mysql://localhost:3306/jaa";
       String user ="root";
       String pass="admin";
       try{
           Class.forName("com.mysql.cj.jdbc.Driver");
           Connection conn=DriverManager.getConnection(url,user,pass);
           System.out.println("Driver load Successfully");
           Statement stmt=(Statement) conn.createStatement();
           String Fname="Mahamud";
           String Lname="Hasan";
           String ins ="Insert into jtable values('"+Fname+"','"+Lname+"')";
           stmt.executeUpdate(ins);
       }
       catch(Exception e)
       {
           System.out.println(e); 
       }
    }
    
}
