/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package readfile2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author joy
 */
public class ReadFile2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       BufferedReader br = null;
       BufferedReader br2 = null;
       try{	
           br = new BufferedReader(new FileReader("G:\\formate.txt"));		

           //One way of reading the file
	   System.out.println("Reading the file using readLine() method:");
	   String contentLine = br.readLine();
	   while (contentLine != null) {
	      System.out.println(contentLine);
	      contentLine = br.readLine();
	   }

	   /**br2 = new BufferedReader(new FileReader("G:\\som.txt"));

	   //Second way of reading the file
	   System.out.println("Reading the file using read() method:");
	   int num=0;
	   char ch;
	   while((num=br2.read()) != -1)
	   {	
               ch=(char)num;
	       System.out.print(ch);
	   } **/

       } 
       catch (IOException ioe) 
       {
	   ioe.printStackTrace();
       } 
       finally 
       {
	   try {
	      if (br != null)
		 br.close();
	      if (br2 != null)
		 br2.close();
	   } 
	   catch (IOException ioe) 
           {
		System.out.println("Error in closing the BufferedReader");
	   }
	}
    }
    
}
