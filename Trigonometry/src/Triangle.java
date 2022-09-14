
//import java.util.Scanner;


public class Triangle {
    double b;
    double h;
    
   /* public void AreaTriangle()
    {
        System.out.println("Area of Triangle: "+(0.5*b*h)); 
    }*/
    Triangle(double x,double y){
        b=x;
        h=y;
    }
    public double tri_area(){
        return 0.5*b*h;
    }
}
