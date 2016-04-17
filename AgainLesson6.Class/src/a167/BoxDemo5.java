/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a167;

/**
 *
 * @author Ferondir
 */
public class BoxDemo5 {
    public static void main(String[] args){
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;
        
        myBox1.setDim(10, 20, 15);
        myBox2.setDim(3, 6, 9);
        
        vol = myBox1.volume();
        System.out.println("Volume equals " + vol);
        
        vol = myBox2.volume();
        System.out.println("Volume equals " + vol);
    }
}
