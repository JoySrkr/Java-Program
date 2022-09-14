
import java.util.Scanner;


public class AllTrigonomirtyArea {
    
    public static void main(String[] args)
    {
        //Circle c;
        //c=new Circle(3.1416,3.25);
        
        //System.out.println(c.AreaCircle());
       // System.out.println(c.Circle(3.1416*3.25));
        //System.out.println(c.r);
        //System.out.println(c.equals(pi*r));
        //c.AreaCircle();
        //Triangle t;
               // t=new Triangle(6,10);
        //t.AreaTriangle();
       //Rectangle r;
              // r=new Rectangle(5.5,2.5);
        //r.AreaRectangle();
        while(true){
        System.out.println("--------Menu------");
        System.out.println("1.Calculator 2.Triangle 3.Rectangle 4.Circle");
        System.out.println("Enter your Choice: ");
        Scanner s=new Scanner(System.in);
        int input =s.nextInt();
        switch(input){
            case 1:
            {
                System.out.println("Select Which operation do you performed?\n 1.Addition 2.Subtraction 3.Multiplication 4.Divide 5.Modulus");
                Scanner sc=new Scanner(System.in);
                int ope=sc.nextInt();
                switch(ope){
                    case 1:
                    {
                       Calculator c=new Calculator(10,8);
                System.out.println("Sum:"+c.callsum()); 
                    }
                    break;
                    case 2:
                    {
                        Calculator c=new Calculator(10,8);
                        System.out.println("Subtraction: "+c.callsub());
                    }
                    break;
                    case 3:
                    {
                        Calculator c=new Calculator(10,8);
                        System.out.println("Multiplication: "+c.callmulti());
                    }
                    break;
                    case 4:
                    {
                        Calculator c=new Calculator(10,8);
                        System.out.println("Divide: "+c.calldivide());
                    }
                    break;
                    case 5:
                    {
                        Calculator c=new Calculator(10,8);
                        System.out.println("Modulus: "+c.callmodu());
                    }
                    break;
                    default:
                        System.out.println("Wrong Choice");
                }
                
            }
                break;
            case 2:
            {Triangle t=new Triangle(6.5,10.5);
                System.out.println("Triangle Area: "+t.tri_area());}
                break;
            case 3:
            {Rectangle1 r=new Rectangle1(4,8);
                System.out.println("Rectangle Area:"+r.rec_area());}
                break;
            case 4:
            {Circle ci=new Circle(3.1416,3.25);
                System.out.println("Circle Area: "+ci.cir_area());}
                break;
            default:
                System.out.println("Wrong Choice");
        }
        }
       // System.out.println("Enter the length:");
       // int a=s.nextInt();
         //System.out.println("Enter the Width:");
       // int b=s.nextInt();
       // Rectangle1 r=new Rectangle1(a,b);
        //Rectangle1 r1=new Rectangle1(4);
       // System.out.println("Rectangle Area:"+r.rec_area());
       // System.out.println("Squre Area:"+r1.rec_area());
    }
}
