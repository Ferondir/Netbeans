/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sort.com.test;

import java.util.Random;

/**
 *
 * @author mypc
 */
public class Arrayall {
    
    //Fill array with random numbers from 1..n
    public static int[] fillArray(int[] array){
        
        for(int i=0;i<array.length;i++){
            array[i] = i + 1;
        }
        
        Random r = new Random();
        int tmp, index;
        
        for(int i=0;i<array.length;i++){
            tmp = array[i];
            index = r.nextInt(array.length);
            array[i] = array[index];
            array[index] = tmp;
        }
        
        return(array);
    }
    
    //Print array
    public static void printArray(int[] array){
        for(int e : array){
            System.out.print(e + " ");
        }
        
        System.out.println();
    }
    
    //reverse array
    public static int[] reverseArray(int[] array){
        
        int[] tmp = new int[array.length];
        
        for(int i=0;i<array.length;i++){
            tmp[i] = array[array.length - i - 1];
        }
        
        for(int i=0;i<array.length;i++){
            array[i] = tmp[i];
        }
        
        return(array);
    }
    
    //sort with method sort Selection
    public static int[] sortSelectionArray(int[] array){
        
        for(int i=0;i<array.length;i++){
            int min = array[i];
            int min_i = i;
            
            for(int j=i;j<array.length;j++){
                if(min>array[j]){
                    min = array[j];
                    min_i = j;
                }
            }
            
            if(min_i != i){
                int tmp = array[i];
                array[i] = array[min_i];
                array[min_i] = tmp;
            }
        }
        
        return(array);
    }
    
    //sort with method Bubble
    public static int[] sortBubbleArray(int[] array){
        
        for(int i=array.length;i>0;i--){
            for(int j=0;j<i-1;j++){
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
            }
        }
        
        return(array);
    }
    
    //fast sort
    public static int[] sortFastArray(int[] array){
        
       sortFastArray(array, 0, array.length-1);
        
       return (array);
    }
    
    private static int[] sortFastArray(int[] A,int low, int high){
        
      int i = low;
      int j = high;
      int x = A[low+(high-low)/2];//int x = A[(low+high)/2];
      do {
         while(A[i] < x) ++i;
         while(A[j] > x) j--;
         if(i <= j){
            int temp = A[i];
            A[i] = A[j];
            A[j] = temp;
            i ++ ; j --;
    }
                 
      } while(i <= j);
      
      if(low < j)  sortFastArray(A, low, j);
      if(i < high) sortFastArray(A, i, high);
     
      return(A);
    }
    
}
