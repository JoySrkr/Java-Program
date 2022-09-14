/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class Overloding {
    String name,hobby;
    int age;
    
    Overloding(){
        System.out.println("There is no Parameter");
        
    }
    Overloding(String n,String h,int a){
        name=n;
        hobby=h;
        age=a;
        
    }
    Overloding(String n,String h){
       name=n;
       hobby=h;
    }
    void displayInformation(){
        System.out.println("Name: "+name);
        System.out.println("Hobby: "+hobby);
        System.out.println("Age: "+age);
        
    }
    
    
}
