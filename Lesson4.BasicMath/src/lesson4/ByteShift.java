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
public class ByteShift {
    public static void main(String[] args){
        byte a=64,b;
        int i;
        
        i = a << 2;
        b = (byte)(a << 2);
        
        System.out.println("int : " + i);
        System.out.println("byte: " + b);
        
        int ii = 0b100_0000_0000_0000_0000_0000_0000_0000;
        byte bb = (byte)ii;
        System.out.println(ii);
        System.out.println(bb);
    }
}
