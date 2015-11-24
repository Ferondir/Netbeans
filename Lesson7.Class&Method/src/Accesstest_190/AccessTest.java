/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Accesstest_190;

/**
 *
 * @author mypc
 */
public class AccessTest {
    public static void main(String[] args){
        Test ob = new Test();
        
        ob.a = 10;
        ob.b = 20;
        
        //ob.c = 100;
        ob.setC(100);
        
        System.out.println("a, b и c : " + ob.a + " " + ob.b + " " + ob.getC());
    }
}
