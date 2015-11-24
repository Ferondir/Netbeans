/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays;

/**
 *
 * @author mypc
 */
public class ArraysDemo {

    public static void main(String[] args) {
        
        int[] tmpArray = new int[10];
        
        System.out.println("\nFill");
        tmpArray = Arrays.arrayFill(tmpArray);
        Arrays.arrayPrint(tmpArray);
        
        
        System.out.println("\nShuffle");
        Arrays.arrayShuffle(tmpArray);
        Arrays.arrayPrint(tmpArray);
        
        System.out.println("\nBubble Sort");
        Arrays.arraySortBubble(tmpArray);
        Arrays.arrayPrint(tmpArray);
        
        
        System.out.println("\nShuffle");
        Arrays.arrayShuffle(tmpArray);
        Arrays.arrayPrint(tmpArray);
        
        System.out.println("\nSelection Sort");
        Arrays.arraySortSelection(tmpArray);
        Arrays.arrayPrint(tmpArray);
        
        
        System.out.println("\nShuffle");
        Arrays.arrayShuffle(tmpArray);
        Arrays.arrayPrint(tmpArray);
        
        System.out.println("\nInsertion Sort");
        Arrays.arraySortInsertion(tmpArray);
        Arrays.arrayPrint(tmpArray);
        
        
        System.out.println("\nShuffle");
        Arrays.arrayShuffle(tmpArray);
        Arrays.arrayPrint(tmpArray);
        
        System.out.println("\nFast Sort");
        Arrays.arraySortFast(tmpArray);
        Arrays.arrayPrint(tmpArray);
    }
    
}
