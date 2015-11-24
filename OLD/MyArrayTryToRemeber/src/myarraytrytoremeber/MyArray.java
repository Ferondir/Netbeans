package myarraytrytoremeber;

import java.util.Random;

public class MyArray {
    
    public static void printArray(int[] array){
        for(int i : array){
            System.out.print(i + " ");
        }
        
        System.out.println();
    }
    
    public static void printArray(int[] array, String who){
        System.out.println("Array prin fwom " + who);
        printArray(array);
    }
        
    public static int[] fillArray(int[] array){
        for(int i=0;i<array.length;i++){
            array[i] = i+1;
        }
        
        Random r = new Random();
        
        for(int i =0; i<array.length; i++){
            int nextId = r.nextInt(array.length);
            int tmp = array[i];
            array[i] = array[nextId];
            array[nextId] = tmp;
            
        }
        
        return(array);
    }
    
    public static int[] reverseArray(int[] array){
        
        int[] tmpArray = new int[array.length];
        
        for(int i=0;i<array.length;i++){
            tmpArray[i] = array[array.length - i - 1];
        }
        
        for(int i=0;i<array.length;i++){
            array[i] = tmpArray[i];
        }
        
        return(array);
    }
    
    public static int[] sortArraySelection(int[] array){
        
        for(int i=0; i<array.length;i++){
            int min = array[i];
            int minIndex = i;
            for(int j=i;j<array.length;j++){
                if(array[j] < min) {
                    min = array[j];
                    minIndex = j;
                }
            }
            
            if(i != minIndex){
                int tmp = array[i];
                array[i] = min;
                array[minIndex] = tmp;
            }
            
        }
        
        return(array);
    }
    
    public static int[] sortArrayBubble(int[] array){
        
        for(int i=0;i<array.length;i++){
            for(int j=i;j<array.length;j++){
                if(array[i]>array[j]){
                    int tmp = array[i];
                    array[i] = array[j];
                    array[j] = tmp;
                }
            }
        }
        
        return(array);
    }
    
    public static int[] sortArrayFast(int[] array){
        
        int firstIndex = 0;
        int lastIndex = array.length-1;
        
        sortArrayFast(array, firstIndex, lastIndex); 
        
        return(array);
    }

    private static int[] sortArrayFast(int[] array, int firstIndex, int lastIndex) {
        
        int f = firstIndex;
        int l = lastIndex;
        int m = array[(firstIndex+lastIndex)/2];

        do{
            while(array[f]<m) {f++;}

            while(array[l]>m) {l--;}
            
            if(f<=l){
                int tmp = array[f];
                array[f] = array[l];
                array[l] = tmp;
                f++;
                l--;
            }
            
        } while(f<=l);
        
        if(firstIndex < l) sortArrayFast(array,firstIndex,l);
        if(lastIndex > f) sortArrayFast(array,f,lastIndex);
        return(array);
    }

}
