/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Access_211;

/**
 *
 * @author mypc
 */
public class Access {
    
    public static void main(String[] args){
        B subOb = new B();
        subOb.setIJ(10, 12);
        
        subOb.sum();
        System.out.println("Summ equals " + subOb.total);
    }
    
    
}
