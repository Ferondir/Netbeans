/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mypc
 */
public class TwoDArray {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int[][] twoDArray = new int[4][];
        
        twoDArray[0] = new int[7];
        twoDArray[1] = new int[10];
        twoDArray[2] = new int[3];
        twoDArray[3] = new int[5];
        
        for(int i=0; i<twoDArray.length;i++){
            for(int j=0; j<twoDArray[i].length;j++){
                System.out.print(twoDArray[i][j] + " ");
            }
            System.out.println();
        }
        
        for(int i=0; i<10; i++){
            
        }
        
    }
    
}
