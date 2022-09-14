/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class inher2 extends inher1 {
    
   private String qualifiaction;
    
   
   public void setQualification(String qualifiaction){
       this.qualifiaction=qualifiaction;
   }
   
   public String getQualification(){
       return qualifiaction ;
   }
   
   
    void display2(){
       // display();
        //System.out.println("Qualification"+qualifiaction="BSC in CSE");
        //qualifiaction="BSc";
        //System.out.println("Qualification: "+qualifiaction);
        System.out.println(getName());
        System.out.println(getAge());
        System.out.println(getQualification());
        
        
    }
    
}
