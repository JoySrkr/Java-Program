/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class inheritTest {
    public static void main(String[] args) {
        InheritB obj1=new InheritB();
        obj1.name="Joy Sarker";
        obj1.age=23;
        obj1.qualification="Bsc in CSE";
        obj1.display2();
        
        InheritB obj2=new InheritB();
        obj2.name="Sasung";
        obj2.age=8;
        obj2.qualification="Monitor";
        obj2.display();
        obj2.display2();
    }
}
