package remembersort;

import java.util.Random;

public class ArrayAll {
    
    public static void printArray(int[] Array){
        System.out.println("");
        
        for(int i=0;i<Array.length;i++){
            System.out.print(Array[i] + " ");
        }
    }
    
    public static int[] fillArray(int[] Array){
        for(int i=0;i<Array.length;i++){
            Array[i] = i+1;
        }
        
        
        Random r = new Random();
        for(int i=0;i<Array.length;i++){
            int swapID = r.nextInt(Array.length);
            int tmp = Array[i];
            Array[i] = Array[swapID];
            Array[swapID] = tmp;      
        }
        
        return(Array);
    }
    
    public static int[] reverseArray(int[] Array){
        int[] tmpArray = new int[Array.length];
        
        for(int i=0;i<Array.length;i++){
            tmpArray[i] = Array[i];
        }
        
        for(int i=0;i<Array.length;i++){
            Array[i] = tmpArray[Array.length-i-1];
        }
        
        return(Array);
    }
    
    public static int[] sortBubleArray(int[] Array){
        for(int i=0;i<Array.length;i++){
            for(int j=0;j<Array.length-i-1;j++){
                if(Array[j]>Array[j+1]){
                    int tmp = Array[j];
                    Array[j] = Array[j+1];
                    Array[j+1] = tmp;
                }
            }
        }
        
        return(Array);
    }
    
    public static int[] sortSelectionArray(int[] Array){
        
        for(int i=Array.length-1;i>0;i--){
            int maxId = i;
            int max = Array[i];
            
            for(int j=0; j<i;j++){
                if(max < Array[j]){
                    max = Array[j];
                    maxId = j;
                }
            }
            
            if(maxId != i){
                int tmp = Array[i];
                Array[i] = Array[maxId];
                Array[maxId] = tmp;
            }
        }
        
        return(Array);
    }
    
    public static int[] sortFastArray(int[] Array, int firstIndex, int lastIndex){
        int f = firstIndex;
        int l = lastIndex;
        int m = Array[f + (l - f)/2];
        
        do{
            while(Array[f]<m)f++;
            while(Array[l]>m)l--;
            
            if(f<=l){
                int tmp = Array[f];
                Array[f] = Array[l];
                Array[l] = tmp;
                f++;
                l--;
            }
            
        }while(f<=l);
        
        if(l>firstIndex) sortFastArray(Array,firstIndex,l);
        if(f<lastIndex) sortFastArray(Array,f,lastIndex);
        return(Array);
    }
    
}
