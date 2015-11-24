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
public class IfTest3 {
    public static void main(String[] args){
        InStack myStack;
        
        DynStack ds = new DynStack(5);
        FixedStack fs = new FixedStack(8);
        
        myStack = ds;
        for(int i=0;i<12;i++)myStack.push(i);
        
        myStack = fs;
        for(int i=0;i<10;i++)myStack.push(i);
        
        myStack = ds;
        System.out.println("Dynamic stack");
        for(int i=0;i<12;i++)System.out.println(myStack.pop());
        
        myStack = fs;
        System.out.println("Fixed stack");
        for(int i=0;i<10;i++)System.out.println(myStack.pop());
        
    }
}
