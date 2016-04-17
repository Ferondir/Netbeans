/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a170;

/**
 *
 * @author Ferondir
 */
public class BoxDemo7 {
    public static void main(String[] args){
        Box myBox1 = new Box(10, 20, 15);
        Box myBox2 = new Box(3, 6, 9);
        double vol;
        
        vol = myBox1.volume();
        System.out.println("Volume equals " + vol);
        
        vol = myBox2.volume();
        System.out.println("Volume equals " + vol);
    }
}
