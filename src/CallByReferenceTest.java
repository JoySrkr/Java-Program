/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class CallByReferenceTest {
    public static void main(String[] args) {
        CallByReference r1=new CallByReference();
        r1.name="Rubel";
        System.out.println("r1 object: "+r1.name);
        
        r1.change(r1);
        System.out.println(r1.name);
        
        
    }
}
