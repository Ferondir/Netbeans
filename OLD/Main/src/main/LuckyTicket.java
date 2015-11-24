/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

/**
 *
 * @author mypc
 */
public class LuckyTicket {
    
    public static final int TICKET_SIZE = 6;
    
    public static Boolean isLucky(int Number){
        int tmp = Number;
        
        int max_number = 1;
        for(int i=0;i<TICKET_SIZE;i++){
            max_number*=10;
        }
        
       if(Number >= max_number || Number < 0) return(false); //Check for ticket range
        
       int[] array = new int[6];
        
        for(int i=0;i<TICKET_SIZE;i++){
            array[TICKET_SIZE-i-1] = Number % 10;
            Number = Number / 10;
        }
        
        System.out.println(array[0] + "" + array[1] + "" + array[2] + "" + array[3] + "" + array[4] + "" + array[5]);
        System.out.println("is lucky " + (array[0] + array[1] + array[2] == array[3] + array[4] + array[5]));
        System.out.println("is Moscom/S-tPOetersburg lucky " + (array[0] + array[1] + array[2] == array[3] + array[4] + array[5]));
        System.out.println("- - - - - - - - - -");
        
        return (true);
    }
    
    public static void Lucky(){
        for(int i=0;i<1_000_000;i++){
            isLucky(i);
        }
    }
    
}
