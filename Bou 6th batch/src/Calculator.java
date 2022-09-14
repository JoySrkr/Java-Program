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
    int a;
    int b;
    Calculator(int x,int y){
        a=x;
        b=y;
    }
    Calculator(double x,int y){
        
    }
   // public void getData(int x,int y){
       // a=x;
       // b=y;
    //}
    public int nesting(){
        return 7;
    }
    
    public int sum(){
        //a=x;
        //b=y;
        int l=nesting();
        return a+b+l;
    }
}
