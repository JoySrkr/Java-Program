/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package user;

import java.util.Scanner;

public class User {

    public static void main(String[] args) {
        String a,b="";
        Scanner s=new Scanner(System.in);
        System.out.println("Enter the strig you want to check: ");
        a=s.nextLine();
        int n=a.length();
        for(int i=n-1;i>=0;i--){
            b=b+a.charAt(i);
            
        }
         if (a.equalsIgnoreCase(b)) {
            System.out.println("The string is palindrome.");
        } else {
            System.out.println("The string is not palindrome.");
        }
    
}
}
