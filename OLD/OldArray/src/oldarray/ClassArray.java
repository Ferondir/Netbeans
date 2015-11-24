/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package oldarray;

/**
 *
 * @author mypc
 */
public class ClassArray {
    
    public static void fillArray(int[] array){
        
        for(int i=0;i<array.length;i++){
            array[i] = i+1;
        }
        
        for(int i=0;i<array.length;i++){
            int rnd = (int)(Math.random()*10);
            int tmp = array[i];
            array[i] = array[rnd];
            array[rnd] = tmp;
        }
    }
    
    public static void printArray(int[] array){
        for(int i=0; i<array.length;i++){
            System.out.print(array[i] + " ");
        }
        
        System.out.println();
    }
    
    public static void reverseArray(int[] array){
        int arrayLength = array.length;
        int[] tmp = new int[arrayLength];
        
        for(int i=0;i<arrayLength;i++){
            tmp[i] = array[i];
        }
                
        for(int i=0;i<arrayLength;i++){
            array[i] = tmp[arrayLength - i - 1];
        }
    }
    
    public static void sortArrayBubble(int[] array){
        for(int i=0;i<array.length;i++){
            for(int j=0;j<array.length-i-1;j++){
                if(array[j]>array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    
                }
            }
        }
    }
    
    public static void sortArraySelection(int[] array){
        for(int i=0;i<array.length;i++){
            
            int min_num = array[i];
            int min_num_index = i;
            
            for(int j=i;j<array.length;j++){
                
                if(min_num>array[j]){
                    min_num = array[j];
                    min_num_index = j;
                }
            }
            
            if(min_num_index != i){
                int tmp = array[i];
                array[i] = array[min_num_index];
                array[min_num_index] = tmp;
            }
        }
    }
    
  
    public static void sortArrayFast(int[] Array, int First, int Last){
        int first = First;
        int last = Last;
        int middle = Array[first + (last-first)/2];
        
        do{
            while(Array[first]<middle)first++;
            while(Array[last-1]>middle)last--;
            
            if(first<=last){
                int tmp = Array[first];
                Array[first] = Array[last-1];
                Array[last-1] = tmp;
                first++;
                last--;
            }
            
        }while(first<=last);
    }
}
