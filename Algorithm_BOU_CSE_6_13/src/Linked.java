
import java.util.LinkedList;
import java.util.Scanner;


public class Linked {
    LinkedList<String> ll=new LinkedList<String>();
    Scanner sc=new Scanner(System.in);
    public void linked_display(){
        /*ll.add("Joy");
        ll.add("123345");
       ll.add("CA class");
        System.out.println(ll);
        ll.remove("Joy");
        System.out.println(ll);*/
        while(true){
            System.out.println("Choose one Operation: \n1.Add Elements \n2.Remove Elements \n3.Display Elements \n4.Exit");
            int i=sc.nextInt();
            switch(i)
            {
                case 1:
                    System.out.println("Type your elements");
                    Scanner s=new Scanner(System.in);
                    String in=s.nextLine();
                    ll.add(in);
                    System.out.println(ll);
                    break;
                case 2:
                    System.out.println("Elements Removed");
                    System.out.println(ll);
                    System.out.println("Which elements you want to removed");
                    Scanner r=new Scanner(System.in);
                    String re=r.nextLine();
                    ll.remove(re);
                    break;
                case 3:
                    System.out.println(ll);
                    break;
                default:
                    System.out.println("Invalid choice");
                   
            }
        }
    }

}
