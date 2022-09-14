/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
class OuterClass{
    int x=10;
     class InnerClass{
       // int y=5;
         public int myInnerMethod(){
             return x;
         }
    }
}
public class InClassEx {
    public static void main(String[] args) {
        OuterClass outer=new OuterClass();
        //OuterClass.OuterClass out=new OuterClass.OuterClass();
        OuterClass.InnerClass inn=outer.new InnerClass();
        System.out.println(inn.myInnerMethod());
    }
}
