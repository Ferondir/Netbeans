/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package sort.com.test;

/**
 *
 * @author mypc
 */
public class Main {
    
    public static void main(String[] args){
        
        int[] e = new int[10];
        
        Arrayall.fillArray(e);
        Arrayall.printArray(e);
                       
        Arrayall.sortSelectionArray(e);
        Arrayall.printArray(e);
        
        Arrayall.reverseArray(e);
        Arrayall.printArray(e);
        
        
        
        Arrayall.fillArray(e);
        Arrayall.printArray(e);
        
        Arrayall.sortBubbleArray(e);
        Arrayall.printArray(e);
        
        
        /*
        Arrayall.fillArray(e);
        Arrayall.printArray(e);
        
        Arrayall.sortFastArray(e);
        Arrayall.printArray(e);
        */
        
        
        int[] ee = {5,7,1,2,3};//Arrayall.fillArray(ee);
        Arrayall.printArray(ee);
        
        Arrayall.sortFastArray(ee);
        Arrayall.printArray(ee);
        
    }
    
}
