
import java.util.Arrays;

public class SelectionSort {
    public void selection_sort(int arr[]){
        int n=arr.length;
        int min,temp=0;
        System.out.println("Arrays are in String form: "+Arrays.toString(arr));
        for(int i=0;i<n;i++)
        {
            min=i;
            for(int j=i+i;j<n;j++)
            {
                if(arr[j]<arr[min])
                {
                    min=j;
                    
                }
            }
            temp=arr[i];
            arr[i]=arr[min];
            arr[min]=temp;
        }
        for(int i=0;i<n;i++)
        {
            System.out.println(arr[i]+" ");
        }
    }
    
}
