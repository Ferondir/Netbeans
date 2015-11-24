/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a270;

/**
 *
 * @author mypc
 */
public class NestTry {
    public static void main(String[] args){
        try{
            int a = args.length;
            int b = 42 / a;
        
            System.out.println("a = " + a);
     
            try{
                //only one argument
                if(a == 1) a = a /(a-a);
            
                if(a == 2) {
                    int c[] = {1};
                    c[42] = 99;
                }
            }catch(ArrayIndexOutOfBoundsException e){
                System.out.println("Array index is out of bounds: " + e);
            }
        
        }catch(ArithmeticException e){
            System.out.println("Division by zero: " + e);
        }
    }
}
