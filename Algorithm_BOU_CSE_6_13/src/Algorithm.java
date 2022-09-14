
import java.util.Scanner;


public class Algorithm {
    
   
    public static void main(String[] args){
        Scanner s=new Scanner(System.in);
        while(true){
            System.out.println("---------------------------\n"
            +"        *Computer Algorithm*              \n"
            +"-----------------------------\n"
            +"    1. Data Structure\n"
            +"    2. Algorithm\n");  
            System.out.println("Type your choice >:");
            int choice = s.nextInt();
            if(choice==1){
                //Input in=new Input();
                System.out.println("------------------\n"
                +"       *Data Structure*          \n"
                +"-------------------------\n"
                +" 1. Linear Search\n"
                +" 2. Binary Search\n"
                +" 3. Bubble Sort\n"
                +" 4.Insertion Sort\n"
                +" 5.Selection Sort\n"
                +" 6. Merge Sort\n"
                +" 7. Quick Sort\n"
                +" 8. Counting Sort\n"
                +" 9. Radix Sort\n"
                +" 10. Bucket Sort\n"
                +" 11.Shell Sort\n"
                +" 12.Stak\n"
                +" 13.Queue\n"
                +" 14.Link List\n"
                +" 15.Heap Sort\n"
                +" 16.Binary Search\n"
                +" 17.Fibonacci Numbers\n"
                +" 18.Euclidean GCD Algorithm\n"
                +" 19.Universal Hashing");
                System.out.println();
                System.out.println("Enter your Data Structure choice >: ");
                int n1=s.nextInt();
                switch(n1){
                    case 1:
                        break;
                    case 2:
                        break;
                    case 3:
                        BubbleSort b=new BubbleSort();
                        Input in=new Input();
                        b.bubble_sort(in.sort_input());
                        break;
                    case 4:
                        InsertionSort ins=new InsertionSort();
                        Input insrt=new Input();
                        ins.insertion_sort(insrt.sort_input());
                        
                        break;
                    case 5:
                        SelectionSort sc=new SelectionSort();
                        Input inss=new Input();
                        sc.selection_sort(inss.sort_input());
                        break;
                        case 6:
                            MergeSort mg=new MergeSort();
                            
                        break;
                        case 7:
                        break;
                        case 8:
                        break;
                        case 9:
                        break;
                        case 10:
                        break;
                        case 11:
                        break;
                        case 12:
                        break;
                        case 13:
                        break;
                        case 14:
                            Linked lk=new Linked();
                            lk.linked_display();
                        break;
                        case 15:
                        break;
                        case 16:
                        break;
                        case 17:
                            FibonacciNumber fib=new FibonacciNumber();
                            fib.fibo();
                        break;
                        case 18:
                            GCD g=new GCD();
                            g.eu_gcd();
                        break;
                        case 19:
                        break;
                        default:
                        
                }
                
            }
            else{
                System.out.println("-------------------\n"
                +"        *Algorithm*      \n"
                +"------------------------\n"
                +"  1. Graph Representation\n"
                +"  2. BFS\n"
                +"  3. DFS\n"
                +"  4. Topological Sort\n"
                +"  5. Krushkal\n"
                +"  6. Prim's\n"
                +"  7. Dijkastra\n"
                +"  8. Bellman-Ford\n"
                +"  9. Floyed-Warshall\n");
                System.out.println();
                System.out.println("Type your Algorithm choice >: ");
                int n2 =s.nextInt();
                switch(n2){
                    case 1:
                        break;
                        case 2:
                        break;
                        case 3:
                        break;
                        case 4:
                        break;
                        case 5:
                        break;
                        case 6:
                        break;
                        case 7:
                        break;
                        case 8:
                        break;
                        case 9:
                        break;
                        default:
                            
                }
            }
        }
    }
    
}
