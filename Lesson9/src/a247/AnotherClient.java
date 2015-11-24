/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a247;

/**
 *
 * @author mypc
 */
public class AnotherClient implements CallBack {

    @Override
    public void callback(int p) {
        System.out.println("Anather kind of method callback()");
        System.out.println("square p = " + (p*p));
    }
    
}
