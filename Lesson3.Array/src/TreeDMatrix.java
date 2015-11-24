/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mypc
 */
public class TreeDMatrix {
    
    public static void main(String[] args){
        
        int[][][] threeD = new int[3][4][5];
        
        for(int i=0;i<threeD.length;i++){
            for(int j=0;j<threeD[i].length;j++){
                for(int k=0;k<threeD[i][j].length;k++){
                    threeD[i][j][k] = i * j * k;
                }
            }
        }
        
        for(int i=0;i<threeD.length;i++){
            for(int j=0;j<threeD[i].length;j++){
                for(int k=0;k<threeD[i][j].length;k++){
                    System.out.print(threeD[i][j][k] + " ");
                }
                
                System.out.println();
            }
            
            System.out.println();
        }
        
        for(int[][] twoD : threeD){
            for(int[] oneD : twoD){
                for(int noD : oneD){
                    System.out.print(noD + " ");
                }
                
                System.out.println();
            }
            
            System.out.println();
        }
    }
}
