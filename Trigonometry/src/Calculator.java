/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class Calculator {
   String s="Hello World";
   int a=10;
   int b=8;
   Calculator (int x,int y){
       a=x;
       b=y;
   }
   public int callsum(){
       //System.out.println("The Character :"+ s);
       //System.out.println("sum: "+(a+b));
       return a+b;
   }
   public int callsub(){
       //System.out.println("sub:"+(a-b));
       return a-b;
   }
   public int callmulti(){
       //System.out.println("multi:"+(a*b));
       return a*b;
   }
   public int calldivide(){
       //System.out.println("multi:"+(a/b));
       return a/b;
   }
    public int callmodu(){
       //System.out.println("multi:"+(a%b));
       return a%b;
   }
}
