/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.handleoperators;

/**
 *
 * @author mypc
 */
public class ForEach2 {
    public static void main(String[] args){
        int sum = 0;
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        
        for(int x : nums){
            System.out.println("x = " + x);
            sum += x;
            if(x == 5) break;
        }
        
        System.out.println("sum = " + sum);
    }
}
