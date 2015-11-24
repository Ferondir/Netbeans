/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadDemo2_179;

/**
 *
 * @author mypc
 */
public class Overload {
    public static void main(String[] args){
        OverloadDemo ob = new OverloadDemo();
        int i =80;
        
        ob.test();
        ob.test(i);
        ob.test(i,i+10);
        ob.test(23.1);
    }
}
