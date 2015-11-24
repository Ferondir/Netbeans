/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a240.p1;

/**
 *
 * @author mypc
 */
public class SamePackage{
        SamePackage(){
        Protection p = new Protection();    
        System.out.println("SamePackage subclass same package constructor");
        
        System.out.println("n = " + p.n);
        
        //allow only in class Protection
        //System.out.println("n_pri = " + n_pri);
        
        System.out.println("n_pro = " + p.n_pro);
        
        System.out.println("n_pub = " + p.n_pub);
    }
}
