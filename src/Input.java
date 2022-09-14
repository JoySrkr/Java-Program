//import java.util.Scanner

//import java.util.Scanner;
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
public class Input {
    public static void main(String[] args) {
        Scanner ob=new Scanner(System.in);
        System.out.println("Enter name,age and salary");
        
        String name=ob.nextLine();
        
        int age=ob.nextInt();
        
        double salary=ob.nextDouble();
        
        System.out.println("Name"+name);
        System.out.println("Age"+age);
        System.out.println("Salary"+salary);
    }
   
}
