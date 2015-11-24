/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VarArgs_204;

/**
 *
 * @author mypc
 */
public class VarArgs {
    static void vaTest(int ... v){
        System.out.print("number of arguments " + v.length + " Consist:");
        
        for(int vv : v){
            System.out.print(vv + " ");
        }
        
        System.out.println();
        
    }
    
    public static void main(String[] args){
        vaTest(10);
        vaTest(1,2,3);
        vaTest();
    }
}
