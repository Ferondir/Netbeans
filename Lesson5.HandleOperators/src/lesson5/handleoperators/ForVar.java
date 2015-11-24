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
public class ForVar {
    public static void main(String[] args){
        boolean done = false;
        
        int x = 0;
        
        for(;!done;){
            System.out.println("x = " + x);
            x++;
            if(x >= 10) done = true;
        }
    }
}
