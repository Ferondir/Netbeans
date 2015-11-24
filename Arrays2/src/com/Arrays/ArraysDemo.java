/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Arrays;

import java.util.Random;

public class ArraysDemo {
    public static void main(String[] args) {
     
        Random r = new Random();
        
        
        
        for (int i = 0; i < 10; i++) {
            int t = 15 + r.nextInt(25 - 15);
            System.out.print(t + " ");
            
            int e = (int)(33 + Math.random()*(35 - 33));
            System.out.print(e + " ");
            
            System.out.println("");
            
        }
    }
    

    
}
