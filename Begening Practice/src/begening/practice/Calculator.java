/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package begening.practice;

/**
 *
 * @author joy
 */
public class Calculator {
   String s="Hello World";
   int a=10;
   int b=8;
   public void callsum(){
       //System.out.println("The Character :"+ s);
       System.out.println("sum: "+(a+b));
   }
   public void callsub(){
       System.out.println("sub:"+(a-b));
   }
   public void callmulti(){
       System.out.println("multi:"+(a*b));
   }
   public void calldivide(){
       System.out.println("multi:"+(a/b));
   }
    public void callmodu(){
       System.out.println("multi:"+(a%b));
   }
}
