/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class ThreadTest implements Runnable {
    public static void main(String[] args) {
        ThreadTest obj=new ThreadTest();
        Thread thread=new Thread(obj);
        thread.start();
        System.out.println("This code is under in Thread");
        
    }
    public void run(){
        System.out.println("This code is outside in Thread");
    }
}
