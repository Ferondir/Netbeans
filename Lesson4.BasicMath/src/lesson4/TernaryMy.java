/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author mypc
 */
public class TernaryMy {
    public static void main(String[] args){
        int ratio;
        
        int[] num = {0,1,2,3,4,5};
        int[] denom = {0,1,2,3,4,5};
        
        for(int i=0;i<num.length;i++){
            for(int j=0;j<denom.length;j++){
                ratio = denom[j] == 0 ? -1 : num[i] / denom[j];
                System.out.print(num[i] + "/" + denom[j] + " = " + ratio + " ");
                
            }
            
            System.out.println();
        }
        
    }
}
