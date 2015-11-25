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
        Arrays.fillArray(ar);
        Arrays.printArray(ar);
        
        Arrays.reverseArray(ar);
        Arrays.printArray(ar);
        
        Arrays.sortArrayBubble(ar);
        Arrays.printArray(ar);
        
        Arrays.fillArray(ar);
        Arrays.printArray(ar);
        
        Arrays.sortArraySelection(ar);
        Arrays.printArray(ar);
    }
}
    

    

