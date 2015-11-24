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
public class TestInterface2 {
    public static void main(String[] args){
        CallBack c = new Client();
        AnotherClient ob = new AnotherClient();
        
        c.callback(42);
        
        c = ob;
        
        c.callback(42);
    }
}
