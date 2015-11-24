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
public class Search {
    public static void main(String[] args){
        int[] nums = {1,2,3,4,5,6,7,8,9,10};
        int searchValue = 5;
        boolean foundSearchValue = false;
        
        for(int x : nums){
            if(x == searchValue){
                foundSearchValue = true;
                break;
            }
        }
        
        if(foundSearchValue){
        System.out.println("Successfully found!");
        }
    }
}
