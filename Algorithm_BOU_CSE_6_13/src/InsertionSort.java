
import java.util.Arrays;
public class InsertionSort {
  public void insertion_sort(int arr[]){
      int n=arr.length;
      int temp;
      int j;
      System.out.println("Arrays are in String form: "+Arrays.toString(arr));
      for(int i=1;i<n;i++)
       {
           temp=arr[i];
           j=i;
           while(j>0 && arr[j-1]>temp)
           {
               arr[j]=arr[j-1];
               j=j-1;
           }
          arr[j] =temp;
       }
       for(int i=0;i<n;i++)
       {
           System.out.println(arr[i]);
       }
  }  
}
