/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class CallByValueTest {
    public static void main(String[] args) {
        CallByValue obj=new CallByValue();
        int x=10;
        String p="pritom";
        System.out.println("The Value of x: "+x);
        
        //obj.change(x);
        System.out.println("The new value of x: "+x);
        
        CallByValue.change(p);
        System.out.println(p);
    }
}
