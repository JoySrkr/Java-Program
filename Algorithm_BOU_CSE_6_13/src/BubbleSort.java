
import java.util.Arrays;
public class BubbleSort{
    public void bubble_sort(int arr[]){
        int n=arr.length;
        System.out.println("Arrays are in String form: "+Arrays.toString(arr));
        for(int i=0;i<n-1;i++){
            for(int j=0;j<n-i-1;j++){
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
               System.out.println("Swapping: "+Arrays.toString(arr));
            }
            System.out.println("Passing: "+Arrays.toString(arr));
        }
        System.out.println("Sorted Data: ");
        for(int i=0;i<n;++i){
            System.out.println(arr[i]+" ");
        }
    }
}