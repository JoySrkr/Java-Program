/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class Rectangle1 {
    int length;
    int width;
    Rectangle1(int x,int y){
        length =x;
        width=y;
    }
   // Rectangle1(int x){
       // length=width=x;
   // }
    public int rec_area(){
        return length*width;
    }
}
