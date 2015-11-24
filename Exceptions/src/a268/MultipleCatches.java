/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a268;

/**
 *
 * @author mypc
 */
public class MultipleCatches {
    public static void main(String[] args){
        try{
            int a = args.length;
            System.out.println("a = " + a);
            int b = 42 / a;
            int c[] = {1};
            c[42] = 99;
        }catch(ArithmeticException e){
            System.out.print("Division by zero : " + e);
        }catch(Throwable e){
            System.out.print("Error index out of array: " + e);
        }
    }
}
