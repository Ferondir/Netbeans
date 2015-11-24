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
public class OldArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        /*
        int[] test = {1,5,43,74,1,4,0,1,5};
        ClassArray.reverseArray(test);
        ClassArray.printArray(test);
        
        int[] test2 = {1,5,43,74,1,4,0,1,5};
        ClassArray.sortArrayBubble(test2);
        ClassArray.printArray(test2);
        
        int[] test3 = {1,5,43,74,1,4,0,1,5};
        ClassArray.sortArraySelection(test3);
        ClassArray.printArray(test3);
        
        int[] test4 = new int[10];
        ClassArray.fillArray(test4);
        ClassArray.printArray(test4);
        */
        int[] test5 = new int[10];
        ClassArray.fillArray(test5);
        ClassArray.printArray(test5);
        
        ClassArray.sortArrayFast(test5, 0, test5.length);
        ClassArray.printArray(test5);
    }
    
}
