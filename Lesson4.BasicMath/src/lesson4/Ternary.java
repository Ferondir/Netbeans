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
public class Ternary {
    public static void main(String[] args){
        int i,k;
        
        i = 10;
        k = i < 0 ? -i : i; //абсолюное значение i
        System.out.println("Абсолюное значение ");
        System.out.println(i + " равно " + k) ;
        
        i = -10;
        k = i < 0 ? -i : i; //абсолюное значение i
        System.out.println("Абсолюное значение ");
        System.out.println(i + " равно " + k) ;
        
        
    
    }
}
