/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Stack_174;

/**
 *
 * @author mypc
 */
public class Stack {
    private int[] stck = new int[10];
    private int tos;
    
    public Stack(){
        tos = -1;
    }
    
    public void push(int item){
        if(tos == 9){
            System.out.println("Stack is full!");
        }else
        stck[++tos] = item;
    }
    
    public int pop(){
       if(tos < 0){
          System.out.println("Stack is empty!"); 
          return(0);
       }else
       return(stck[tos--]); 
    }
}
