/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a240.p2;

/**
 *
 * @author mypc
 */
public class OtherPackage {
    OtherPackage(){
        a240.p1.Protection p = new a240.p1.Protection();
        System.out.println("OtherPackage other package class constructor");
        
        //allow only in package p1
        //System.out.println("n = " + p.n);
        
        //allow only in class Protection
        //System.out.println("n_pri = " + p.n_pri);
        
        //allow only in subclass or same package
        //System.out.println("n_pro = " + p.n_pro);
        
        System.out.println("n_pub = " + p.n_pub);
    }
}
