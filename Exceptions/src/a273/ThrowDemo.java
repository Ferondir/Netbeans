/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a273;

/**
 *
 * @author mypc
 */
public class ThrowDemo {
    public static void demoproc(){
        
            try {
                throw new NullPointerException("DEMO");
            } catch (NullPointerException e) {
                System.out.println("Exception catched in body of method emoproc() ");
                throw e;
            }
        }

    public static void main(String[] args){
        try {
            demoproc();
        } catch (NullPointerException e) {
            System.out.println("Catch again " + e);
        }
        
    }
}
