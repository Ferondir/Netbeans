/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author mypc
 */
public class OpBitEquals {
    
    public static void main(String[] args){
        int a = 1, b = 2, c = 3;
    
        a |= 4;
    
        System.out.println("a = " + a);
        
        
        b >>= 1;
        
        System.out.println("b = " + b);
        
        c <<= 1;
        
        System.out.println("c = " + c);
        
        a ^= c;
        
        System.out.println("a = " + a);
        
    }
    
    
    
}
