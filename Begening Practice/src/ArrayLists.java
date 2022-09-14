/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
import java.util.ArrayList;
import java.util.Iterator;
public class ArrayLists {
    public static void main(String[] args) {
       ArrayList<Integer> num=new ArrayList<Integer>();
        System.out.println("size: "+num.size());
       num.add(10);
       num.add(20);
       num.add(30);
       num.add(40);
       num.add(2,50);
        //System.out.print("arry"+num);
        //Iterator itr=(Iterator) num;
       // for(int x: num)
        //{
           // System.out.print(" "+x);
       // }
      Iterator itr=num.iterator();
      while(itr.hasNext()){
          System.out.print(" "+itr.next());
      }
        
    }
 
}
