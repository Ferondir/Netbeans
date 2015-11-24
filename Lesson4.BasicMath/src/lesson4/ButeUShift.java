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
public class ButeUShift {
    
    public static void main(String[] args){
        char[] hex = {
                        '0','1','2','3','4','5','6','7',
                        '8','9','A','B','C','D','E','F'
        };
        
        byte b = (byte) 0xf1; //0xf1;     16*15+1 = 241(в 10) => 1_111_0001(в 2 int) => - _ 000 _ 1111(в 2 byte) => -15(в 10 byte)
        byte c = (byte) (b >> 4); // -15 = 0000_0000_1111_0001(в 2 Int) >> 4 = 
        byte d = (byte) (c >>> 4);
        byte e = (byte) ((b & 0xff) >> 4);
        
        System.out.println("b = 0x" + hex[(b>>4)& 0x0f] + hex[b & 0x0f]);
        System.out.println("c = 0x" + hex[(c>>4)& 0x0f] + hex[c & 0x0f]);
        System.out.println("d = 0x" + hex[(d>>4)& 0x0f] + hex[d & 0x0f]);
        System.out.println("e = 0x" + hex[(e>>4)& 0x0f] + hex[e & 0x0f]);
        
    }
    
}
