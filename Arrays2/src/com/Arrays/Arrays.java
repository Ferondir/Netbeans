/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Arrays;

import java.io.InputStream;
import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author mypc
 */
public class Arrays {
    public static void arrayPrint(int[] array){
        for(int e : array){
            System.out.print(e + " ");
        }
        
        System.out.println("");
    }
    
    public static int[] arrayFill(int[] array){
        
        for(int i=0;i<array.length;i++){
            array[i] = i;
        }

        return(array);
    }
    
    public static int[] arrayFillManual(int[] array){
        Scanner in = new Scanner(System.in);
        
        for(int i=0;i<array.length;i++){
            System.out.print("Enter " + i + " element:");
            array[i] = in.nextInt();
        }
        
        return(array);
    }
    
    public static int[] arrayShuffle(int[] array){
        
        Random r = new Random();
        
        for (int i = 0; i < array.length; i++) {
            
            int tmp_i = r.nextInt(10);        
            int tmp = array[i];
            array[i] = array[tmp_i];
            array[tmp_i] = tmp;
            
        }
        
        return(array);
    }
    
    public static int[] arrayReverse(int[] array){
        for(int i=0;i<array.length/2;i++){
            int tmp = array[i];
            array[i] = array[array.length - i - 1];
            array[array.length - i - 1] = tmp;
        }
        
        return (array);
    }
    
    public static int[] arraySortBubble(int[] array){
        
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
    
    public static int[] arraySortSelection(int[] array){
        
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
    
    public static int[] arraySortInsertion(int[] array){
        
        for(int i=1;i<array.length;i++){
            int tmp = array[i];
            int j;
            
            for(j=i;j>0;j--){
                if(tmp > array[j-1]){
                    break;
                }
                
                array[j] = array[j-1];
            }
            
            array[j] = tmp;
 
        }
        
        return(array);
    }

    private static Scanner Scanner(InputStream in) {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }
}
