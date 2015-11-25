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
        
        for (int i = 0; i < array.length; i++) {
            
            int tmp_i = r.nextInt(10);        
            int tmp = array[i];
            array[i] = array[tmp_i];
            array[tmp_i] = tmp;
            
        }
        
        return(array);
    }
    
    public static int[] reverseArray(int[] array){
        for(int i=0;i<array.length/2;i++){
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        
        return (array);
    }
    
    public static int[] sortArrayBubble(int[] array){
        
        for(int i=0;i<array.length - 1;i++){
            for(int j=0;j<array.length - i - 1;j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    
                }
            }
        }
        
        return (array);
    }
    
    public static int[] sortArraySelection(int[] array){
        
        for(int i=0;i<array.length;i++){
            int min = i;
            
            for(int j=i;j<array.length;j++){
                if(array[min]>array[j])min=j;
            }
            
            if(min != i){
                int tmp = array[i];
                array[i] = array[min];
                array[min] = tmp;
            }
        }
        
        return (array);
    }
}
