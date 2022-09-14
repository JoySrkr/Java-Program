
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
public class AmrmStrong {
    public static void main(String[] args) {
        int sum=0,temp,r;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter any number");
        int input=sc.nextInt();
        temp=input;
        while(temp!=0)
        {
            r=temp%10;
            sum=sum+r*r*r;
            temp=temp/10;
            System.out.println(sum);
        }
        
        if(input==sum)
        {
            System.out.println("Armstrong Number");
            
        }
        else
        {
            System.out.println("Not Armstrong Number");
        }
    }
}
