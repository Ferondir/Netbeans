/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a266_2;

/**
 *
 * @author mypc
 */
public class Exc2 {
    public static void main(String[] args){
        int d, a;
        
        try{
            d = 0;
            a = 42 / d;
            System.out.println("after exception");
        }catch(ArithmeticException e){
            System.out.println("Divide by 0");
        }
        
        System.out.println("After catch");
    }
}
