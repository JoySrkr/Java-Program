/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class InstanceOf {
    public static void main(String[] args) {
        AnimalU a=new AnimalU();
        AmiName an=new AmiName();
        AniType at=new AniType();
        
        System.out.println(an instanceof AnimalU );
        System.out.println(a instanceof AnimalU);
        System.out.println(a instanceof AniType);
        System.out.println(at instanceof AnimalU);
        
        
    }
}
