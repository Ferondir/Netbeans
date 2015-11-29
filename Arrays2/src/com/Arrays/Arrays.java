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
    
    static int num = 0;
    
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

        for(int i=0;i<array.length;i++){
            
            
            boolean error = true;
            
            do{
                try {
                    Scanner in = new Scanner(System.in);
                    System.out.print("Enter " + i + " element:");
                    array[i] = in.nextInt();
                    error = false;
                } catch (Exception e) {
                    System.out.println("NOT INT");
                }    
            } while (error);
             
        }
        
        return(array);
    }
    
    public static int[] arrayShuffle(int[] array){
        
        Random r = new Random();
        
        for (int i = 0; i < array.length; i++) {
            
            int tmp_i = r.nextInt(array.length);        
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
    
    public static int[] arraySortFast(int[] array){
        
        arraySortFast(array,0,array.length-1);
        
        return(array);
    }
    
    private static void arraySortFast(int[] array, int First, int Last){
        System.out.println(++num);
        
        int first = First;
        int last = Last;
        int middleElement = array[first + (last-first)/2];
        System.out.println("mid " + middleElement + " f:" + first + " l:"+last); 
        
        do{
            while(array[first] < middleElement) first++;
            while(array[last] > middleElement) last--;
            
            if(first <= last){
                int tmp = array[first];
                array[first] = array[last];
                array[last] = tmp;
                
                first++;
                last--;
                
                //System.out.print("* f:" + first + " l:" + last + " | " );
                arrayPrint(array);
            }
        }while(first <= last);
        
        System.out.println("mid " + middleElement + " f:" + first + " l:"+last);
        
        if(First < last){arraySortFast(array,First,last);};
        if(first < Last){arraySortFast(array,first,Last);};
        
    }

}
