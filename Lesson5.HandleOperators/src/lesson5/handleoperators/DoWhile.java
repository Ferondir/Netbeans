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
public class DoWhile {
    public static void main(String[] args){
        int n = 0;
        
        do{
            System.out.println("n = " + n);
        }while(++n<10);
    }
}
