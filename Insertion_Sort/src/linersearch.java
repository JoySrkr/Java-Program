/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class linersearch {
    public static void main(String[] args){
        int arr[]={6,5,3,2,1};
        int item=6;
        int temp=0;
        for(int i=0;i<arr.length;i++)
        {
            if(item==arr[i])
            {
                System.out.println("successful "+"index of search "+i);
                temp=temp+1;
            }
        }
        if(temp==0)
        {
            System.out.println("Item not in the list!");
        }
    }
            
    
}
