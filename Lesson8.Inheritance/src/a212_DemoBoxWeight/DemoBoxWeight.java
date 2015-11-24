/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a212_DemoBoxWeight;

/**
 *
 * @author mypc
 */
public class DemoBoxWeight {
    public static void main(String[] args){
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.76);
        
        double vol;
        
        vol = myBox1.volume();
        System.out.println("muBox1 volume equals " + vol);
        System.out.println("muBox1 weiht equals " + myBox1.weight);
        System.out.println();
        
        vol = myBox2.volume();
        System.out.println("muBox2 volume equals " + vol);
        System.out.println("muBox2 weiht equals " + myBox2.weight);
        System.out.println();
              
    }
}
