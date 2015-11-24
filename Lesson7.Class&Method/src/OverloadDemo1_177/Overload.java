/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadDemo1_177;

/**
 *
 * @author mypc
 */
public class Overload {
    public static void main(String[] args){
        OverloadDemo ob = new OverloadDemo();
        ob.test();
        ob.test(10);
        ob.test(20,30);
        System.out.println("a*a = " + ob.test(23.1));
    }
}
