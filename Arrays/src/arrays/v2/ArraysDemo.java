/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package arrays.v2;

/**
 *
 * @author mypc
 */
public class ArraysDemo {
    public static void main(String[] args){
        int[] array = new int[10];
        
        System.out.println("\narrayFill");
        Arrays.arrayFill(array);
        Arrays.arrayPrintln(array);
        
        System.out.println("\narrayShuffle");
        Arrays.arrayShuffle(array);
        Arrays.arrayPrintln(array);
        
        System.out.println("\narraySortBubble");
        Arrays.arraySortBubble(array);
        Arrays.arrayPrintln(array);
        
        System.out.println("\narrayShuffle");
        Arrays.arrayShuffle(array);
        Arrays.arrayPrintln(array);
        
        System.out.println("\narraySortSelection");
        Arrays.arraySortSelection(array);
        Arrays.arrayPrintln(array);
        
        System.out.println("\narrayShuffle");
        Arrays.arrayShuffle(array);
        Arrays.arrayPrintln(array);
        
        System.out.println("\narraySortInsertion");
        Arrays.arraySortInsertion(array);
        Arrays.arrayPrintln(array);
        
        System.out.println("\narrayShuffle");
        Arrays.arrayShuffle(array);
        Arrays.arrayPrintln(array);
        
        System.out.println("\narraySortFast");
        Arrays.arraySortFast(array);
        Arrays.arrayPrintln(array);
        
        
        
        
    }
}
