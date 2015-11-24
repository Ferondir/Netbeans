/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClassDemo_199;

/**
 *
 * @author mypc
 */
public class Outer {
    int outer_x = 100;
    
    void tets(){
        for(int i=0;i<10;i++){
            class Inner{
                void display(){
                    System.out.println("out : outer_x = " + outer_x);
                }
            }
            
            Inner inner = new Inner();
            inner.display();
        }
    }
}

