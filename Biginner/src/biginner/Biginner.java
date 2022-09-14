
package biginner;

import java.util.Scanner;


public class Biginner {

    public static void main(String[] args) {
       int first=1;
       int second=2;
       int fib;
        System.out.println("Enter How many number do you Print");
       Scanner sc=new Scanner(System.in);
       int n=sc.nextInt();
        System.out.print(first+" "+second);
        for (int i = 3; i <= n; i++) {
            fib=first+second;
            System.out.print(" "+fib);
            first=second;
            second=fib;
            
        }
        
       
       
    }
            
    }
    

