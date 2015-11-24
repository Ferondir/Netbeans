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
public class Continue {
    public static void main(String[] args){
        for(int i=1;i<=10;i++){
            System.out.print(i + " ");
            if(i%2 != 0) continue;
            System.out.println();
        }
    }
}
