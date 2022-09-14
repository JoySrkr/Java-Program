/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class OOP_Test {
    public static void main(String [] args){
        Hello h=new Hello();
        //Calculator c=new Calculator();
         Calculator c=new Calculator(5,10);
       //String t= h.s;
       // System.out.println(h.s);
       
      // h.display();
      //c.getData(5, 10);
        System.out.println(c.sum());
    }
    
}
