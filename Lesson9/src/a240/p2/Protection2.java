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
public class Protection2 extends a240.p1.Protection {
    Protection2(){
        System.out.println("Protection2 subclass other package constructor");
        
        //allow only in package p1
        //System.out.println("n = " + n);
        
        //allow only in class Protection
        //System.out.println("n_pri = " + n_pri);
        
        System.out.println("n_pro = " + n_pro);
        
        System.out.println("n_pub = " + n_pub);
    }
}
