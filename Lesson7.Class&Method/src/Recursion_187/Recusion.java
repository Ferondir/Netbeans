/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion_187;

/**
 *
 * @author mypc
 */
public class Recusion {
    public static void main(String[] args){
        Factorial f = new Factorial();
        
        System.out.println("factorila 3 equlas " + f.fact(3));
        System.out.println("factorila 3 equlas " + f.fact(4));
        System.out.println("factorila 3 equlas " + f.fact(5));
        
        System.out.println("factorila 7 equlas " + Factorial.fact(7));
    }
}
