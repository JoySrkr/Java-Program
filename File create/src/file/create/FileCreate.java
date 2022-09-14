/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package file.create;

import java.io.File;
import java.io.IOException;

public class FileCreate {

    public static void main(String[] args) {
       try {
           File file = new File("G:\\formate.txt");
           boolean fvar = file.createNewFile();
           if(fvar){
               System.out.println("File has been created successfully");
           }else{
               System.out.println("File already preasent at the specified location");
               
           }
       } catch(IOException e){
           System.out.println("Exception Occured: ");
           e.printStackTrace();
       }
    }
    
}
