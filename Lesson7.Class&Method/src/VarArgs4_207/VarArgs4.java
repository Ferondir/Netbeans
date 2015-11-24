/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VarArgs4_207;

/**
 *
 * @author mypc
 */
public class VarArgs4 {
    static void vaTest(int ... v){
        System.out.print("vTest(int ...)" + "Number of arguments " + v.length + " Consist: ");
        
        for(int vv : v){
            System.out.print(vv + " ");
        }
        
        System.out.println();
    }
    
    static void vaTest(boolean ... v){
        System.out.print("vaTest(boolean ...)"+ "Number of arguments " + v.length + " Consist: ");
        
        for(boolean vv : v){
            System.out.print(vv + " ");
        }
        
        System.out.println();
    }
    
    public static void main(String[] args){
        vaTest(1,2,3);
        vaTest(true,true,false);
        //ERROR vaTest();
    }
}
