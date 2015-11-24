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
public class Nested {
    public static void main(String[] args){
        for(int i=0;i<10;i++){
            for(int j=10-i; j>0; j--){
                System.out.print(".");
            }
            
            System.out.println();
        }
    }
}
