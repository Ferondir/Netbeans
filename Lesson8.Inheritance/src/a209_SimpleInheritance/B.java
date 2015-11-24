/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a209_SimpleInheritance;

/**
 *
 * @author mypc
 */
class B extends A {
    int k;
    
    void showK(){
        System.out.println("k : " + k);
    }
    
    void sum(){
        System.out.println("i+j+k : " + (i+j+k));
    }
}
