
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class FormatingDate {
    public static void main(String[] args) {
       LocalDateTime myTime=LocalDateTime.now();
        System.out.println("Before: "+myTime);
        
        DateTimeFormatter afTime=DateTimeFormatter.ofPattern("E,MMM dd yyyy HH:mm:ss");
        String fD=myTime.format(afTime);
        System.out.println("After Time: "+fD);
        
                
    }
}
