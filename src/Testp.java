/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class Testp {
    public static void main(String[] args) {
        Overloding over=new Overloding();
        over.displayInformation();
        
        Overloding over2=new Overloding("Joy","Football",22);
        over2.displayInformation();
        
        Overloding over3=new Overloding("Randy","WWE");
        over3.displayInformation();
    }
}
