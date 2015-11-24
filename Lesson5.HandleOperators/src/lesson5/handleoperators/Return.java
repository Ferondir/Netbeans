/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.handleoperators;

/**
 *
 * @author mypc
 */
public class Return {
    public static void main(String[] args){
        boolean t = true;
        
        System.out.println("До возврата");
        
        if(t) return;
        
        System.out.println("После вызова return");
        
    }
}
