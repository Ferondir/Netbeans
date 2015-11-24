/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestStack_191;

/**
 *
 * @author mypc
 */
public class Stack {
    private int[] stck = new int[10];
    private int tos;
    
    Stack(){
        tos = -1;
    }
    
    void push(int item){
        if(tos == 9) System.out.println("Stack is full");
        else stck[++tos] = item;
    }
    
    int pop(){
        return(stck[tos--]);
    }
}
