/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.sort2;

import java.util.Random;

/**
 *
 * @author mypc
 */
public class Arrays {
    
    //print array
    public static void arrayPrint(int[] array){
        for(int e : array){
            System.out.print(e + " ");
        }
        
         System.out.print("\n");
    }
    
    //fill array
    public static int[] arrayFill(int[] array){
        
        for(int i=0; i<array.length;i++){
            array[i] = i + 1;
        }
        
        Random r = new Random();
        int tmp, index;
                
        for(int i=0; i<array.length;i++){
            tmp = array[i];
            index = r.nextInt(array.length);
            array[i] = array[index];
            array[index] = tmp;
        }
        
        return(array);
    }
    
    //reverse array
    public static int[] arrayReverse(int[] array){
        
        int[] tmpArray = new int[array.length];
        
        for(int i=0; i<array.length;i++){
            tmpArray[i] = array[array.length - i - 1];
        }
        
        //array = tmpArray;
        for(int i=0; i<array.length; i++){
            array[i] = tmpArray[i];
        }
        
        return(array);
    }
    
    //sort with method SORT SELECTION
    public static int[] arraySortSelection(int[] array){
        
        for(int i=array.length-1;i>=0;i--){
            
            int max = array[i];
            int max_index = i;
            
            for(int j=0;j<i;j++){           
                if(max < array[j]){
                    max = array[j];
                    max_index = j;
                }        
            }
            
            if(i != max_index){
               int tmp = array[i];
               array[i] = array[max_index];
               array[max_index] = tmp;
            }
        }
        
        return(array);
    }
    
    //sort with method BUBBLE
    public static int[] arraySortBubble(int[] array){
       
        for(int i=0; i<array.length;i++){
            for(int j=0; j<array.length - i - 1;j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        
        return(array); 
    }
    
    //sort with method FAST SORT or qSort
    public static int[] arraySortFastSort(int[] array){
        
        int low = 0;
        int high = array.length-1;
        
        arraySortFastSort(array, low, high);
        
        return(array); 
    }
    
    private static int[] arraySortFastSort(int[] array, int low, int high){
        
        int i = low;
        int j = high;
        int x = array[(low+high)/2]; //int x = array[high + (low - high)/2];
        
        do{
            while(array[i] < x) i++;
            while(array[j] > x) --j;
            
            if(i<=j){
                int tmp = array[i];
                array[i] = array[j];
                array[j] = tmp;
                i++;
                j--;
            }
            
        } while(i <= j);
        
        if(low < j)  arraySortFastSort(array, low, j);
        if(i < high) arraySortFastSort(array, i, high);
        
        return(array); 
    }
    
}
