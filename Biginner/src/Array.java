
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
public class Array {
    public static void main(String[] args) {
        
       double []number = new double[10];
        
      // number[0]=ins;
       //number[1]=ins;
       //number[2]=ins;
       //number[3]=ins;
       double sum=0;//=number[0]+number[1]+number[2]+number[3];
        //System.out.println(sum);
        for (int i = 0; i < 5; i++) {
            System.out.println("Enter  number"); 
       Scanner sc=new Scanner(System.in);
       double ins=sc.nextDouble();
            number[i]=ins;
            sum=sum+number[i];
           // System.out.println(sum);
        }
        System.out.println("The all number of sum: "+sum);
    }

}
