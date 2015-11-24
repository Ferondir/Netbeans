/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package UseStatick_193;

/**
 *
 * @author mypc
 */
public class UseStatick {
    static int a = 3;
    static int b;
    
    static void meth(int x){
        System.out.println("x = " + x);
        System.out.println("a = " + a);
        System.out.println("b = " + b);
    }
    
    static{
        System.out.println("Static block");
        b = a * 4;
    }
    
    public static void main(String[] args){
        meth(42);
    }
}
