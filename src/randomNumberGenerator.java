
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class randomNumberGenerator {
    public static void main(String[] args) {
        Random rad=new Random();
        int randomNumber=rad.nextInt(10)+1;
        System.out.println(randomNumber);
        
        int radi=(int)(Math.random()*10);
        System.out.println(radi);
    }
}
