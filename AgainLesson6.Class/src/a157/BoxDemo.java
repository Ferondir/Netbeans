/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a157;

/**
 *
 * @author Ferondir
 */
public class BoxDemo {
    public static void main(String[] args){
        Box myBox = new Box();
        
        double vol;
        
        myBox.width = 10;
        myBox.height = 20;
        myBox.depth = 15;
        
        vol = myBox.width * myBox.height * myBox.depth;
        System.out.println("Volume equals " + vol);
    }
}
