/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
enum Level{
    LOW,
    MEDIUM,
    HIGH;
}
public class enumMain {
    public static void main(String[] args) {
       //Level ob=Level.MEDIUM;
        //System.out.println(ob);
        
        for(Level ob:Level.values()){
            System.out.println(ob);
        }
        
        
       
    
}
}
