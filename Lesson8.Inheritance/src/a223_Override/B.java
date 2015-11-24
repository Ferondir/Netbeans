/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a223_Override;

/**
 *
 * @author mypc
 */
public class B extends A {
    int k;
    
    B(int a, int b, int c){
        super(a, b);
        this.k = c; 
    }
    
    void show(){
        System.out.println("k " + k);
    }
}
