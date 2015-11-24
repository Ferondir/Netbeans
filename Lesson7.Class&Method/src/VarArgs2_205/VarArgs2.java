/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package VarArgs2_205;

/**
 *
 * @author mypc
 */
public class VarArgs2 {
    static void vaTest(String msg, int ... v){
        System.out.print(msg + v.length + " consist: ");
        for(int vv : v){
            System.out.print(vv + " ");
        }
        System.out.println();
    }
    
    public static void main(String[] args){
        vaTest("one parameter various length ",10);
        vaTest("three parameters various length ",1,2,3);
        vaTest("no parameter various length ");
    }
}
