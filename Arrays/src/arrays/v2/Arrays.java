/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.v2;

import java.util.Random;

/**
 *
 * @author mypc
 */
public class Arrays {
    public static int[] arrayFill(int[] array){
        
        for(int i=0;i<array.length;i++){
            array[i] = i + 1;
        }
        
        return(array);
    }
    
    public static int[] arrayShuffle(int[] array){
        
        for(int i=0;i<array.length;i++){
            
            
            Random rnd = new Random();
            int index = i + rnd.nextInt(array.length - i);
            arraySwapElements(array, i, index);
        }
        
        return(array);
    }
    
    public static void arrayPrintln(int[] array) {
        
        arrayPrint(array);
        System.out.println();
    }
    
    public static void arrayPrint(int[] array){
        
        for(int e : array){
            System.out.print(e + " ");
        }
        
    }
    
    public static int[] arraySortBubble(int[] array){
        
       for(int i=0;i<array.length;i++){
           for(int j=0;j<array.length - i -1;j++){
               if(array[j] > array[j+1]){
                   arraySwapElements(array,j,j+1);
               }
           }
       } 
        
        return(array);
    }
    
    public static int[] arraySortSelection(int[] array){
        for(int i=0;i<array.length;i++){   
            
            int min_index = i;
            
            for(int j=i;j<array.length;j++){
                if(array[min_index] > array[j]){ //Find index with min value             
                    min_index = j;   
                }
            }
            
            if(min_index != i){
                arraySwapElements(array,i,min_index);
            }
        }
        
        
        return(array);
    }
    
    public static int[] arraySortInsertion(int[] array){
        
        for(int i=1;i<array.length;i++){
            int tmp = array[i];
            int j;
            
            for(j=i;j>0;j--){
                
                
                
                if(tmp > array[j-1]) {
                    break;
                }
                
                array[j] = array[j-1];
            }
            
            array[j] = tmp;
        }
        
        
        return(array);
    }
    
    //For first call
    public static int[] arraySortFast(int[] array){
      
        int min = 0;
        int max = array.length - 1;
        
        arraySortFast(array, min, max);
        
        return(array);
    };
    
    public static int[] arraySortFast(int[] array, int min, int max){
        
        int this_min = min;
        int this_max = max;
        int middle = array[min + (max - min)/2]; // int middle = array[min+max/2]; 
        
        
        do{
            while(array[this_min] < middle) {this_min++; };
            while(middle < array[this_max]) {--this_max; };
            
            if(this_min <= this_max){
                //int tmp = array[this_min];
                //array[this_min] = array[this_max];
                //array[this_max] = tmp;
                arraySwapElements(array,this_min,this_max);
                
                this_min++;
                this_max--;
                
                arrayPrint(array);
            }
            
        }while(this_min <= this_max);
        
        if(min < this_max) arraySortFast(array,min,this_max);
        if(this_min < max) arraySortFast(array,this_min,max);
        
        return(array);
    }
    
    
    private static int[] arraySwapElements(int[] array, int index_1, int index_2){
        
        int tmp = array[index_1];
        array[index_1] = array[index_2];
        array[index_2] = tmp;
        
        return(array);
    }
}
