/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a283;

/**
 *
 * @author mypc
 */
public class MultiCatch {
    public static void main(String[] args){
        int a = 10, b = 0;
        
        int[] vals = {1, 2, 3};
        
        try {
            //int result = a / b;
            vals[10] = 19;
            
        } catch (ArithmeticException | ArrayIndexOutOfBoundsException e) {
            System.out.println("Catch exception - " + e);
        }
        
        System.out.println("After multiple catch");
    }
}
