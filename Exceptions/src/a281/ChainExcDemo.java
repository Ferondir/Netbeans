/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a281;

/**
 *
 * @author mypc
 */
public class ChainExcDemo {
    public static void main(String[] args){
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Catch exception " + e);
            System.out.println("Root cause " + e.getCause());
        }
        
    }
    
    static void demoproc(){
        NullPointerException e = new NullPointerException("upper level");
        
        e.initCause(new ArithmeticException("reason"));
        
        throw e;
    }
}
