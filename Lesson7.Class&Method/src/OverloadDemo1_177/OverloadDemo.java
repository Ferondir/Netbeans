/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadDemo1_177;

/**
 *
 * @author mypc
 */
public class OverloadDemo {
    void test(){
        System.out.println("No paramters");
    }
    
    void test(int a){
        System.out.println("a : " + a);
    }
    
    void test(int a, int b){
        test(a);
        System.out.println("b : " + b);
    }
    
    double test(double a){
        return(a*a);
    }
}
