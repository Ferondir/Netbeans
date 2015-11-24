/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package PassArray_204;

/**
 *
 * @author mypc
 */
public class PasArray {
    static void vaTest(int[] v){
        System.out.print("Number of argument " + v.length + "Containt: ");
        for(int x : v)
            System.out.print(x + " ");
        System.out.println();
    }
    
    public static void main(String[] args){
        int[] n1 = {10};
        int[] n2 = {1, 2, 3};
        int[] n3 = {};
        
        vaTest(n1);
        vaTest(n2);
        vaTest(n3);
    }
}
