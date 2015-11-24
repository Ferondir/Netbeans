/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VarArgs3_206;

/**
 *
 * @author mypc
 */
public class VarArgs3 {
    static void vaTest(int ... v){
        System.out.print("vaTest(int ...): " + "Number of arguments: " + v.length + " Consist: ");
        
        for(int vv : v){
            System.out.print(vv + " ");
        }
        
        System.out.println();
    }
    
    static void vaTest(boolean ... v){
        System.out.print("vaTest(boolean ...): " + "Number of arguments:" + v.length + " Consist: ");
        
        for(boolean vv : v){
            System.out.print(vv + " ");
        }
        
        System.out.println();
    }
    
    static void vaTest(String msg, int ... v){
        System.out.print("vaTest(String, int ...): " + msg + v.length + " Consist: ");
        
        for(int vv  : v){
            System.out.print(vv + " ");
        }
        
        System.out.println();
    }
    
    public static void main(String[] args){
        vaTest(1, 2, 3);
        vaTest("Test", 10, 20);
        vaTest(true, false, true);
    }
}
