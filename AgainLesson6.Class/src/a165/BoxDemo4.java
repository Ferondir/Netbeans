/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a165;

/**
 *
 * @author Ferondir
 */
public class BoxDemo4 {
    
    public static void main(String[] args){
        Box myBox1 = new Box();
        Box myBox2 = new Box();
        double vol;

        myBox1.width = 10;
        myBox1.heigth = 20;
        myBox1.depth = 15;
        
        myBox2.width = 3;
        myBox2.heigth = 6;
        myBox2.depth = 9;
        
        vol = myBox1.volume();
        System.out.println("Volume equals " + vol);
        
        vol = myBox2.volume();
        System.out.println("Volume equals " + vol);
    }

}
