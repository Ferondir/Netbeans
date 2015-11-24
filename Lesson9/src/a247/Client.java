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
public class Client implements CallBack {

    @Override
    public void callback(int p) {
        System.out.println("param = " + p);
        System.out.println(too);
    }
    
    void nonIfaceMeth(){
        System.out.println("Another interface");
    }
    
}
