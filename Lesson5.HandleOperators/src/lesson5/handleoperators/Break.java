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
public class Break {
    public static void main(String[] args){
        boolean t = true;
        
        first:{
            System.out.println("first start");
            
            second:{
                System.out.println("second start");
                
                third:{
                    System.out.println("third start");
                    if(t)break second;
                    System.out.println("third end");
                }
                
                System.out.println("second end");
            }
            
            System.out.println("first end");
        }
    }
}
