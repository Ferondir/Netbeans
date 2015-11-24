/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadDemo2_179;

/**
 *
 * @author mypc
 */
public class OverloadDemo {
    void test(){
        System.out.println("No paramters");
    }
    
    void test(int a, int b){
        System.out.println("a : " + a + "; b : " + b);
    }
    
    void test(double a){
        System.out.println("a : " + a);
    }
}
