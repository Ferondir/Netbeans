/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Recursion2_188;

/**
 *
 * @author mypc
 */
public class Recursion2 {    
    
    public static void main(String[] args){
        
        RecTest rc = new RecTest(10);
    
        for(int i=0;i<10;i++){
            rc.values[i] = i;
        }
        
        rc.printArray(10);
    }
}
