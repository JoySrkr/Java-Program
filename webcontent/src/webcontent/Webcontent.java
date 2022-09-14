/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webcontent;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.MalformedURLException;
import java.net.URL;

/**
 *
 * @author joy
 */
public class Webcontent {

    
    public static void main(String[] args) throws MalformedURLException, IOException {
      URL url = new URL("https://www.youtube.com/watch?v=vjsnZHhI2Z0&ab_channel=SaregamaMusic");
      BufferedReader reader = new BufferedReader(new InputStreamReader(url.openStream()));
      BufferedWriter writer = new BufferedWriter(new FileWriter("E:\\windows phone.html"));
      String line;
      while((line=reader.readLine())!=null){
          System.out.println("line");
          writer.write(line);
          writer.newLine();
          
      }
      reader.close();
      writer.close();
      
      
    }
    
}
