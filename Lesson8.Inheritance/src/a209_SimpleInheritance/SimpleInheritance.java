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
public class SimpleInheritance {
    public static void main(String[] args){
        A superOb = new A();
        B subOb = new B();
        
        superOb.i = 10;
        superOb.j = 20;
        System.out.println("superOb.showIJ();");
        superOb.showIJ();
        System.out.println();
        
        subOb.i = 7;
        subOb.j = 8;
        subOb.k = 9;
        System.out.println("subOb.showIJ();");
        System.out.println("subOb.showK();");
        subOb.showIJ();
        subOb.showK();
        System.out.println();
        
        System.out.println("subOb.sum();");
        subOb.sum();
    }
}
