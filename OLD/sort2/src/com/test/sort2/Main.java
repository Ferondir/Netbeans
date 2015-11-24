/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.test.sort2;

/**
 *
 * @author mypc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int N = 20; //array size
        int[] array; //name array
        array = new int[N];//initialize array
        
        System.out.print("\nArray initialized\n");
        Arrays.arrayPrint(array);
        
        System.out.print("\nFill array\n");
        Arrays.arrayFill(array);
        Arrays.arrayPrint(array);
        
        System.out.print("\nReverse array\n");
        Arrays.arrayReverse(array);
        Arrays.arrayPrint(array);
        
        System.out.print("\nSort array with method SORT SELECTION\n");
        Arrays.arraySortSelection(array);
        Arrays.arrayPrint(array);
        
        System.out.print("\nFill array again\n");
        Arrays.arrayFill(array);
        Arrays.arrayPrint(array);
        
        System.out.print("\nSort array with method BUBBLE\n");
        Arrays.arraySortBubble(array);
        Arrays.arrayPrint(array);
        
        System.out.print("\nFill array again\n");
        Arrays.arrayFill(array);
        Arrays.arrayPrint(array);
        
        System.out.print("\nSort array with method FAST SORT or qSort\n");
        Arrays.arraySortFastSort(array);
        Arrays.arrayPrint(array);
        
        System.out.print("\nExaple with qSort\n");
        int[] e = {5,7,1,8,4};
        Arrays.arrayPrint(e);
        e = Arrays.arraySortFastSort(e);
        Arrays.arrayPrint(e);
        
    }
    
}
