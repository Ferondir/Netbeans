/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a274;

/**
 *
 * @author mypc
 */
public class ThrowsDemo {
    public static void main(String[] args){
        try {
            throwOne();
        } catch (IllegalAccessException e) {
            System.out.println("Catch exception " + e);
        }
    }
    
    static void throwOne() throws IllegalAccessException{
        System.out.println("In body of method throwOne()");
        throw new IllegalAccessException("Demo");
    }
}
