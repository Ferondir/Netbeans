/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a174;

/**
 *
 * @author Ferondir
 */
public class TestStack {
    
    public static void main(String[] args){
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();

        for(int i =0;i<10;i++){
            myStack1.push(i);
        }
        
        for(int i =10;i<20;i++){
            myStack2.push(i);
        }
        
        System.out.println("Values of stack myStack1");
        for(int i=0;i<10;i++){
            System.out.println(myStack1.pop());
        }
        
        System.out.println("Values of stack myStack2");
        for(int i=0;i<10;i++){
            System.out.println(myStack2.pop());
        }
    }

}
