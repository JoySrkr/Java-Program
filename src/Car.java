/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class Car extends Vehicle {
    int gear;

    public Car(String c, double w,int g) {
        super(c, w);
        gear=g;
        
    }
    
    @Override
    void attribute(){
        
       super.attribute();
        System.out.println("Gear: "+gear);
        
    }
}
