/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TestStack_196;

/**
 *
 * @author mypc
 */
public class TestStack2 {
    public static void main(String[] args){
        Stack myStack1 = new Stack(5);
        Stack myStack2 = new Stack(8);
        
        //fill
        for(int i=0;i<5;i++) myStack1.push(i);
        for(int i=0;i<8;i++) myStack2.push(i);
        
        //print
        System.out.println("myStack1 : ");
        for(int i=0;i<5;i++){
            System.out.println(myStack1.pop());
        }
        
        System.out.println("myStack2 : ");
        for(int i=0;i<8;i++){
            System.out.println(myStack2.pop());
        }
        
    }
}
