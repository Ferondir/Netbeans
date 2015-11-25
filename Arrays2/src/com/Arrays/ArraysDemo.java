/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.Arrays;

import java.util.Random;

public class ArraysDemo {
    public static void main(String[] args) {
     
        int[] ar = new int[10];
        
        System.out.println("\nFILL");
        Arrays.arrayFillManual(ar); //auto fill: Arrays.arryFill(ar);
        Arrays.arrayPrint(ar);
        System.out.println("_____________");
        
        System.out.println("\nREVERSE");
        Arrays.arrayReverse(ar);
        Arrays.arrayPrint(ar);
        System.out.println("_____________");
        
        System.out.println("\nSHUFFLE");
        Arrays.arrayShuffle(ar);
        Arrays.arrayPrint(ar);
        System.out.println("_____________");
        
        System.out.println("\nBUBBLE SORT");
        Arrays.arrayShuffle(ar);
        Arrays.arrayPrint(ar);
        Arrays.arraySortBubble(ar);
        Arrays.arrayPrint(ar);
        System.out.println("_____________");
        
        System.out.println("\nSELECTION SORT");
        Arrays.arrayShuffle(ar);
        Arrays.arrayPrint(ar);
        Arrays.arraySortSelection(ar);
        Arrays.arrayPrint(ar);
        System.out.println("_____________");
        
        System.out.println("\nINSERTION SORT");
        Arrays.arrayShuffle(ar);
        Arrays.arrayPrint(ar);
        Arrays.arraySortInsertion(ar);
        Arrays.arrayPrint(ar);
        System.out.println("_____________");
    }
}
    

    

