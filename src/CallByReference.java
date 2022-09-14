/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author joy
 */
public class CallByReference {
    String name;
   static void change(CallByReference r2){
        r2.name="Sumon";
    }
}
