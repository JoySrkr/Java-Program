/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package writefile;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

/**
 *
 * @author joy
 */
public class WriteFile {

    
    public static void main(String[] args) {
        FileOutputStream fos = null;
        File file;
        String mycontent = "This is my Data which needs"+
                " to be written into the file";
        try{
            file = new File("G:\\som.txt");
            fos=new FileOutputStream(file);
            if(!file.exists()){
                file.createNewFile();
            }
            byte[] bytesArray = mycontent.getBytes();
            fos.write(bytesArray);
            fos.flush();
            System.out.println("FIle Written Successfully");
            
        }
        catch(IOException ioe){
           ioe.printStackTrace();
        }
        finally{
            try{
                if(fos!=null)
                {
                    fos.close();
                }
            }
            catch(IOException ioe){
                System.out.println("Error in closing the Stream");
            }
        }
        
    }
    
}
