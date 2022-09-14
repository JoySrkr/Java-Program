
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
public class FinArrayMax {
    public static void main(String[] args) {
        int arr[]=new int[5],inpu = 0;
        int[] temp = null;
        System.out.println("Enter any five Number: ");
        Scanner sc=new Scanner(System.in);
        
        for(int i=0;i<arr.length;i++){
           arr[i]=sc.nextInt();  
        }
        for(int i=0;i<arr.length;i++)
        {
            ;
            inpu=inpu+arr[i];
            System.out.print(" "+inpu);
                    }
        
    }
    
}
