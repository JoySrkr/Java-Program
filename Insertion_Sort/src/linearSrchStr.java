/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class linearSrchStr {
    public static void main(String [] args)
    {
        String arr[]={"Deepak","Rohit","Rahul","Joy"};
        String item="Joy";
        for(int i = 0;i<arr.length;i++)
        {
          if(arr[i].equals(item))
                System.out.println("The Index position of the Item: "+i);
        }
        
    }
}
