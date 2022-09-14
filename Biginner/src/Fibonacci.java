
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
public class Fibonacci {
    public static void main(String[] args) {
        int first=0;
        int second=1;
        int fib;
        System.out.println("Enter how many number do you want to print");
        Scanner sc=new Scanner(System.in);
        int ins=sc.nextInt();
        System.out.print(first+" "+second);
        for (int i = 3; i <= ins; i++) {
            
            fib=first+second;
            System.out.print(" "+fib);
            first=second;
            second=fib;
            
        }
    }
}
