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
public class Factorial {
    static int fact(int n){
        if(n==1) return(1);
        else return(fact(n-1)* n);
    }
}
