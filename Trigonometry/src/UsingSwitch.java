
import java.util.Scanner;


public class UsingSwitch {

    public static void main(String[] args) {
        System.out.println("Please Enter Your Choice");
        Scanner sc = new Scanner(System.in);
        int i = sc.nextInt();
        switch (i) {
            case 1: {
                System.out.println("1.Calculator");
            }
            break;
            case 2: {
                System.out.println("2.Rectange");
            }
            break;
            case 3:             
            {
                System.out.println("3.Triangle");
            }
            break;
            case 4:
            {
                System.out.println("4.Circle");
            }
            break;

        }
    }

}
