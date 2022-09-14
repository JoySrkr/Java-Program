/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class PersonB {
    private String Name;
    private String uniName;
    private int CouDur;
   private int age;
    
   public void setName(String Name)
   {
       this.Name=Name;
       
   }
   public String getName(){
       return Name;
       
   }
   
   public void setUniName(String uniName){
       this.uniName=uniName;
       
   }
   public String getUniName(){
       return uniName;
   }
    
   public void setCouDur(int CouDur){
       this.CouDur=CouDur;
   }
   public int getCouDur(){
       return CouDur;
   }
   
   public void setAge(int age){
       this.age=age;
   }
   public int getAge(){
       return age;
   }
   
   
}
