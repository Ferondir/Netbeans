/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a249;

/**
 *
 * @author mypc
 */
public class NestedIfDemo {
    public static void main(String[] args){
        A.NestedIf b = new B();
        
        if(b.isNotNegative(10))System.out.println("Number 10 is positive");
        if(b.isNotNegative(-12))System.out.println("Number -12 is positive");
    }
}
