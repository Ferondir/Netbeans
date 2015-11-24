/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.handleoperators;

/**
 *
 * @author mypc
 */
public class Comma {
    public static void main(String[] args){
        int a, b;
        
        for(a=1, b=4;a<b;a++,b--){
            System.out.println("a = " + a + "; b = " + b + ";");
        }
    }
}
