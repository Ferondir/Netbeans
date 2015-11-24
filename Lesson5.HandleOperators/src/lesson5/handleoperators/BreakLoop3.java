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
public class BreakLoop3 {
    public static void main(String[] args){
        for(int i=0;i<3;i++){
            System.out.print("Проход " + i + " : ");
            
            for(int j=0; j<100; j++){
                if(j == 10) break;
                System.out.print(j + " ");
            }
            
            System.out.println();
        }
    }
}
