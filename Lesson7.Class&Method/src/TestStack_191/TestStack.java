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
public class TestStack {
    public static void main(String[] args){
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();
        
        for(int i=0;i<10;i++){
            myStack1.push(i);
            myStack2.push(i+10);
        }
        
        System.out.println("Stack 1 : ");
        for(int i=0;i<10;i++) System.out.println(myStack1.pop());
        
        System.out.println("Stack 2 : ");
        for(int i=0;i<10;i++) System.out.println(myStack2.pop());
    }
}
