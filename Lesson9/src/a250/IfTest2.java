/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a250;

/**
 *
 * @author mypc
 */
public class IfTest2 {
    public static void main(String[] args){
        
        //initialize
        DynStack myStack1 = new DynStack(5);
        DynStack myStack2 = new DynStack(8);
        
        //fill
        for(int i=0;i<12;i++) myStack1.push(i);
        for(int i=0;i<20;i++) myStack2.push(i);
        
        //print
        System.out.println("Stack in myStack1:");
        for(int i=0; i<12; i++)System.out.println(myStack1.pop());
        
        System.out.println("Stack in myStack2:");
        for(int i=0; i<20; i++)System.out.println(myStack2.pop());
    }
}
