/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Arrays;

import java.util.Random;

/**
 *
 * @author mypc
 */
public class Arrays {
    public static void printArray(int[] array){
        for(int e : array){
            System.out.print(e + " ");
        }
        
        System.out.println("");
    }
    
    public static int[] fillArray(int[] array){
        
        for(int i=0;i<array.length;i++){
            array[i] = i;
        }
        
        Random r = new Random();
        int t = r.nextInt(10);
        
        
        return(array);
    }
}
