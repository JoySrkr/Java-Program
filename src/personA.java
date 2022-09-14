/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class personA {
    private String name;
    private int age;
    
    public void setName(String name){
        this.name=name;
    }
    public String getName(){
        return name;
    }
    
    public void setAge(int age){
        this.age=age;
        
    }
    
    public int getAge(){
        return age;
    }
    
    void displayInformation(){
        System.out.println(getName());
        
        System.out.println(getAge());
        
    }
    
    void display(){
        System.out.println("Name"+name);
        System.out.println("Age"+age);
        
    }
}
