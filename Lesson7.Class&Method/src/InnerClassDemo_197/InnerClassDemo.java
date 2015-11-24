/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package InnerClassDemo_197;

class Outer{
    int outer_x = 100;
    
    void test(){
        Inner inner = new Inner();
        inner.display();
        inner.y = 2;
        //y = 2;
    }
    
    class Inner{
        
        int y = 1;
        
        void display(){
            System.out.println("print: outer_x = " + outer_x);
        }
    }
}

public class InnerClassDemo {
    public static void main(String[] args){
        Outer outer = new Outer();
        outer.test();
    }
}
