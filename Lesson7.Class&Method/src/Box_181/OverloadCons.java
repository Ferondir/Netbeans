/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box_181;

/**
 *
 * @author mypc
 */
public class OverloadCons {
    public static void main(String[] args){
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box();
        Box myBox3 = new Box(7);
        
        double vol;
        
        //myBox1
        vol = myBox1.volume();
        System.out.println("myBox1 volume = " + vol);
        
        //myBox2
        vol = myBox2.volume();
        System.out.println("myBox2 volume = " + vol);
        
        //myBox3
        vol = myBox3.volume();
        System.out.println("myBox3 volume = " + vol);
    }
}
