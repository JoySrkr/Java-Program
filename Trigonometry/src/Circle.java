
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class Circle {
    double pi=3.1416;
    double r=3.25;
   // double pi;
   // double r;
 //public double AreaCircle(){
       //System.out.println("Area of Circle: "+(pi*r*r));
      // return (pi*r*r);
  
    Circle(double x,double y){
        pi=x;
       r=y;
        }
    public double cir_area(){
        return pi*r;
    }
}

