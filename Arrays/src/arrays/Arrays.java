/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

import java.util.Random;

/**
 *
 * @author mypc
 */
public class Arrays {
    
    public static void arrayPrint(int[] array){
        
        for (int i=0;i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }
    
    public static int[] arrayFill(int[] array){
        
        for(int i=0;i<array.length;i++){
            array[i] = i + 1;
        }
        
        return(array);
    }
    
    public static void arrayShuffle(int[] array){
           
        for(int i=0;i<array.length;i++){
           Random rn = new Random(); 
           int e = rn.nextInt(array.length - i) + i;
           //System.out.print(e + " ");
           
           int tmp = array[i];
           array[i] = array[e];
           array[e] = tmp;
        }
    }
    
    private static void swap(int[] array, int x, int y){
        int tmp = array[x];
        array[x] = array[y];
        array[y] = tmp;
    }
    
    public static int[] arraySortSelection(int[] array){
        
        for(int i=0;i<array.length;i++){
            
            int min_index = i;  //int min = array[i];
            
            for(int j=i;j<array.length;j++){
                if(array[j] < array[min_index]){
                    min_index = j;
                }
            }
            
            if(i != min_index){
                //int tmp = array[i];
                //array[i] = array[min_index];
                //array[min_index] = tmp;
                swap(array, i, min_index);
            }
        }
        
        return(array);
    }
    
    public static int[] arraySortBubble(int[] array){
        
        for(int i=0;i<array.length;i++){
            
            for(int j=0;j<array.length-i-1;j++){
                if(array[j] > array[j+1]){
                    //int tmp = array[j];
                    //array[j] = array[j+1];
                    //array[j+1] = tmp;
                    swap(array,j,j+1);
                }
            }
        }
        
        return(array);
    }
    
    public static int[] arraySortInsertion(int[] array){
        
        for(int i=1;i<array.length;i++){
            int tmp = array[i];
            
            int j;
            
            for(j=i; j>0;j--){
                if(tmp > array[j-1]) break; //cancel loop
                
                array[j] = array[j - 1];
            }
            
            array[j] = tmp;
        }
        
        return(array);
    }
    
    public static int[] arraySortFast(int[] array){
        int min = 0;
        int max = array.length-1;
        
        arraySortFast(array, min, max);
        
        return(array); 
    }
    
    public static int[] arraySortFast(int[] array, int min, int max){
        int midle = array[min + (max - min)/2]; 
        System.out.println("mdl " + midle);
        
        int min_i = min;
        int max_j = max;
        
        do{
            while(midle > array[min_i]) {min_i++;}
            while(midle < array[max_j]) {--max_j;}
            
            if(min_i <= max_j){
                //System.out.println("swap! " + min_i + " " + max_j);
                swap(array, min_i, max_j);
                min_i++;
                max_j--;                
            }
            
            //System.out.println("End");
            
        }while(min_i <= max_j);
        
        if(min < max_j) arraySortFast(array, min, max_j);   
        if(min_i < max) arraySortFast(array, min_i, max);  
        
        return(array); 
    }
    
    
    
}
