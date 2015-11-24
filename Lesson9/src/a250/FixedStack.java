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
public class FixedStack implements InStack{
    private int stck[];
    private int tos;
    
    FixedStack(int size){
        stck = new int[size];
        tos = -1;
    }
    
    @Override
    public void push(int item){
        if(tos>=stck.length-1)System.out.println("Stack is overloaded");
        else stck[++tos] = item;
    }
    
    @Override
    public int pop(){
        if(tos<0){
            System.out.println("Stack is empty");
            return(-1);
        } 
        else return(stck[tos--]);
    }
}
