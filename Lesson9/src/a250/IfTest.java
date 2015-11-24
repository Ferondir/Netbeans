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
public class IfTest {
    public static void main(String[] args){
        //initiate
        FixedStack myStack1 = new FixedStack(5);
        FixedStack myStack2 = new FixedStack(8);
        
        
        //fill
        for(int i=0;i<5;i++){
            myStack1.push(i);
        }
        
        for(int i=0;i<8;i++){
            myStack2.push(i);
        }
        
        //get
        System.out.println("Stack in myStack1");
        for(int i=0;i<5;i++)System.out.println(myStack1.pop());
        
        System.out.println("Stack in myStack2");
        for(int i=0;i<8;i++)System.out.println(myStack2.pop());
    }
}
