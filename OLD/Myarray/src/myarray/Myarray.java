package myarray;

import java.util.Random;


public class Myarray {

    public static int[] arrayFill(int[] array){
        
        for(int i=0;i<array.length;i++){
            array[i] = i+1;
        }
        
        Random r = new Random();
        
        for(int i=0;i<array.length;i++){
            int nextI = r.nextInt(array.length);
            int tmp = array[i];
            array[i] = array[nextI];
            array[nextI] = tmp;
        }
        
        return(array);
    }
    
    public static int[] arrayReverse(int[] array){
        
        int[] tmpArray = new int[array.length];
        
        for(int i=0;i<array.length;i++){
            tmpArray[i] = array[array.length - i - 1];
        }
        
        for(int i=0;i<array.length;i++){
            array[i] = tmpArray[i];
        }
        
        return(array);
    }
    
    public static void arrayPrint(int[] array){
        for(int e : array){
            System.out.print(e + " ");
        }
        
        System.out.print("\n");
    }
    
    public static int[] arraySortBubble(int[] array){
        
        for(int i=array.length-1; i>0;i--){
            for(int j=0;j<i;j++){
                
                if(array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                }
                
            }
        }
        
        return(array);
    }
    
    public static int[] arraySortSelection (int[] array){
            for(int i=array.length-1;i>0;i--){
                
                int max = array[i];
                int max_i = i;
                
                for(int j =0; j<i;j++){
                    if(array[j] > max){
                        max_i = j;
                        max = array[j];
                }
            }
            
            if(i != max_i){
                int tmp = array[i];
                array[i] = array[max_i];
                array[max_i] = tmp;
            }
        }
        
        return(array);
    }
    
}
