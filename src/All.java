
import java.time.LocalTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Random;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class All {
    public static void main(String[] args) {
        Random rand=new Random();
        int randomNumber=rand.nextInt(10)+1;
        LocalTime time=LocalTime.now();
        System.out.println(time);
        
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("hh:mm:ss");
        String formattedTime=time.format(formatter);
        System.out.println(formattedTime);
        
        String s="32";
        int i=Integer.valueOf(s);
        System.out.println(i);
        
        int in=100;
        String obj=Integer.toString(in);
        System.out.println(obj);
        
        String st="3999";
        int obj2=Integer.parseInt(st);
        System.out.println(obj2);
        
        int x=399;
        Integer obj3=Integer.valueOf(x);
        System.out.println(obj3);
        
        Double d=new Double(10.25);
        double e=d.doubleValue();
        System.out.println("e= "+e);
        
        Integer inti= new Integer(8743);
        int obj4=inti.intValue();
        System.out.println(obj4);
        
        String FN="Joy ";
        String LN="Sarker";
        String FullName=FN+LN;
        System.out.println(FullName);
        String upNam=FullName.toUpperCase();
        System.out.println(upNam);
        
        String s3=FullName;
        char ch=FullName.charAt(4);
        System.out.println(ch);
        
        char ch2=FullName.charAt(6);
        System.out.println(ch2);
        
        char ch3=LN.charAt(3);
        System.out.println(ch3);
        
        int pos=FullName.lastIndexOf("a");
        System.out.println(pos);
        String s4="I Love My Country which name is Bangladesh";
        char s5=s4.charAt(7);
        System.out.println("Index Of 6 = "+s5);
        
        int s6=s4.lastIndexOf("M");
        
        System.out.println(s6);
        
        int posi=s4.lastIndexOf("r");
        System.out.println(posi);
        StringBuffer sb=new StringBuffer("RandyOrthon");
        System.out.println(sb);
        sb.append(" WWE");
        System.out.println(sb);
        
        sb.setLength(5);
        System.out.println("The position of N = "+sb);
        sb.delete(0, 4);
        System.out.println(sb);
    }
  
}
