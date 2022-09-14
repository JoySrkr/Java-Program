
//import static java.lang.Double.sum;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class Rcursion {

    public static void main(String[] args) {
    int result=sum(2,5);
        System.out.println(result);
    
    }
    public static int sum(int start,int end){
       if(end>start){
           return end+sum(start,end-1);
       }else{
        return end;
       } 
    }
}
