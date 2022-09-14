/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package webping;

import java.net.InetAddress;
import java.net.Socket;

/**
 *
 * @author joy
 */
public class WebPing {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       try {
         InetAddress addr;
         Socket sock = new Socket("www.google.com", 80);
         addr = sock.getInetAddress();
         System.out.println("Connected to " + addr);
         sock.close();
      } catch (java.io.IOException e) {
         System.out.println("Can't connect to " + args[0]);
         System.out.println(e);
      }
    }
    
}
