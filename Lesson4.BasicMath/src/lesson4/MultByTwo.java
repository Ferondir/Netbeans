/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author mypc
 */
public class MultByTwo {
    
    public static void main(String[] args){
        byte b;
        b = 7;
        
        for(int i=0;i<4;i++){
            b<<=1;
            System.out.println(b);
        }
        
        int num = 0xFFFFFFE;
        for(int i=0;i<4;i++){
            num = num << 1;
            System.out.println(num);
        }
        
        
    }
    
}
