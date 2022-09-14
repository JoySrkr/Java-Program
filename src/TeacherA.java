/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class TeacherA extends personA {
    private String quali;
    
    public void setQuali(String quali){
        this.quali=quali;
    }
    
    public String getQuali(){
        return quali;
    }
    
    
    void display2(){
        display();
        System.out.println("Qualification"+quali);
        
    }
    
    void displayInformation2(){
        System.out.println("Private Name: "+getName());
        System.out.println("Private Age: "+getAge());
        System.out.println("Private Qualification: "+getQuali());
        
    }
    
}
