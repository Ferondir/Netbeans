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
public class NoBody {
    public static void main(String[] args){
        int x = 100, y = 200;
        
        while(++x < --y) ;
        System.out.println("Среднее значенеие равно " + x);
    }
}
