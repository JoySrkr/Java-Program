/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfile;

import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 *
 * @author joy
 */
public class ReadFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       File file =new File("G:\\som.txt");
       BufferedInputStream bis = null;
       FileInputStream fis = null;
       
       try{
           fis = new FileInputStream(file);
           bis = new BufferedInputStream(fis);
           while(bis.available()>0){
               System.out.println((char)bis.read());
           }
       }catch(FileNotFoundException fnfe)
       {
           System.out.println("The specified file not found"+fnfe);
       }
       catch(IOException ioe)
       {
           System.out.println("I/O Exception: "+ioe);
       }
       finally
       {
           try{
               if(bis != null && fis!=null)
               {
                   fis.close();
                   bis.close();
               }
           }catch(IOException ioe)
           {
               System.out.println("Error in InputStream clsoe(): "+ioe);
           }
       }
    }
    
}
