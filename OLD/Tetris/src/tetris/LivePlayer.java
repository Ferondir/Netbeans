/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetris;

import java.util.Scanner;

/**
 *
 * @author mypc
 */
public class LivePlayer extends Player{
    
    private int[] coords = new int[2];
   
    @Override
    public int[] turn() {
        Scanner in = new Scanner(System.in);
        
        
        System.out.println("Enter x coordinate\n:");
        int x = in.nextInt();
        
        System.out.println("Enter y coordinate\n:");
        int y = in.nextInt();
        
        coords[0] = x;
        coords[1] = y;
        
        return (coords);
    }
    
    
}
