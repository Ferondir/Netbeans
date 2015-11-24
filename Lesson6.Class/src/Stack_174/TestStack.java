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
public class TestStack {
    
    public static void main(String[] args){
        Stack myStack1 = new Stack();
        Stack myStack2 = new Stack();
    
        //fill Stack
        for(int i=0;i<10;i++){
            myStack1.push(i);
        }  
        
        for(int i=10;i<20;i++){
            myStack2.push(i);
        }
        
        //get Stack
        System.out.println("myStack1 elements:");
        for(int i=0;i<10;i++){
            System.out.println(myStack1.pop());
        }
        
        System.out.println("myStack2 elements:");
        for(int i=0;i<10;i++){
            System.out.println(myStack2.pop());
        }
    }

}
