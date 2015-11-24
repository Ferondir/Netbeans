/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;

/**
 *
 * @author mypc
 */
public class Fibo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int i = 0;
        
        
        Fibonachi.getSimpleNumber(i);
        
        do{
            System.out.println(Fibonachi.getFibo(i));
            i++;
        } while(true);
    }
    
    
    
    
}
