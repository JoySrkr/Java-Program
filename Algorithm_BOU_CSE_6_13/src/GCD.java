
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
public class GCD {
        public void eu_gcd() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter Two Number");
       int a = scanner.nextInt();
       int b = scanner.nextInt();
 
       int gcd = getGcd(a, b);
        
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
    
//}
