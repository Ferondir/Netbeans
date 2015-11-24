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
public class InDec {
    public static void main(String[] args){
        int a = 1;
        int b = 2;
        int c;
        int d;
        
        c = ++b;
        d = a++;
        c++;
        
        System.out.println(a + "\n" + b + "\n" + c + "\n" + d);
        
    }
}
