/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
import java.util.Scanner;
 
/**
 * Java Program to print LCM and GCD of two numbers using recursion
 */
public class PrintLcmHcfFunction {
 
    public static void main(String[] args) {
        int a, b, t, aTemp, bTemp, lcm, gcd;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Number");
        a = scanner.nextInt();
        b = scanner.nextInt();
 
        gcd = getGcd(a, b);
        
        //lcm = (a * b) / gcd;
        //System.out.println("LCM = " + lcm);
        System.out.println("GCD = " + gcd);
    }
 
    public static int getGcd(int a, int b) {
        if (b == 0) {
            return a;
        } else {
            return getGcd(b, a % b);
        }
    }
}