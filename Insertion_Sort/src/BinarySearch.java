/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class BinarySearch {
    public static void main(String [] args)
    {
        int arr[]={2,4,6,8,10,12,16,18,20,22,26};
        int item=16;
        int li=0;
        int hi=arr.length-1;
        int mid=(li+hi)/2;
        while(li<=hi)
        {
            if(arr[mid]==item)
            {
                System.out.println("Index of item: "+mid);
                break;
            }
            else if(arr[mid]<item)
            {
                li=mid+1;
            }
            else
            {
                hi=mid-1;
            }
            mid=(li+hi)/2;
        }
        if(li>hi)
        {
            System.out.println("Item is not present");
        }
        
    }
    
}
