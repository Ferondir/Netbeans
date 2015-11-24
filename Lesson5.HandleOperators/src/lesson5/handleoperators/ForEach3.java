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
public class ForEach3 {
    public static void main(String[] args){
        int sum = 0;
        int[][] nums = new int[3][5];
        
        for(int i=0;i<nums.length;i++){
            for(int j=0;j<nums[i].length;j++){
                nums[i][j] = (i+1)*(j+1);
            }
        }
        
        for(int[] x : nums){
            for(int y : x){
                System.out.println("value = " + y);
                sum += y;
            }
        }
        
        System.out.println("Total: " + sum);
    }
}
