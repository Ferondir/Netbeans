/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author mypc
 */
public class Average {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        double[] tmpArray = {11.1, 54.0, 1.0};
        double d = 11.0d;
        int xx = 0x5;
        double tmp = 0;
        
        for(int i=0; i<tmpArray.length;i++) tmp = tmp + tmpArray[i];
            
        System.out.println(d/tmpArray.length);
        
        
    }
    
}
