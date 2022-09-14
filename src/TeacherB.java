/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class TeacherB extends PersonB {
   private String quali;
   
   public String getQuali(){
       return quali;
   }
   public void setQuali(String quali){
       this.quali=quali;
   }
    
    void display(){
        System.out.println(getName());
        System.out.println(getUniName());
        System.out.println(getCouDur());
        System.out.println(getAge());
        System.out.println(getQuali());
        
    }
    
}
