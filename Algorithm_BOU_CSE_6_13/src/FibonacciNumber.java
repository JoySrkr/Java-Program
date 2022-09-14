
import java.util.Scanner;


public class FibonacciNumber { 
    public static int fibonacci(int n){
	if(n == 0){
		return 0;
	}
	if(n == 1 || n == 2){
			return 1;
		}
	return fibonacci(n-2) + fibonacci(n-1);
	}
     
	public void fibo(){
            System.out.println("Enter How many Number do you want to print: ");
            Scanner sc=new Scanner(System.in);
        int num = sc.nextInt();
	System.out.print("Fibonacci Series of "+num+" numbers: ");
	for(int i = 0; i < num; i++){
			System.out.print(fibonacci(i) +" ");
		}
       
    }
}

