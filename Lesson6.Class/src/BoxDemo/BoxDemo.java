/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxDemo;

/**
 *
 * @author mypc
 */
public class BoxDemo {
    public static void main(String[] main){
        Box mybox = new Box();
        
        double vol;
        
        mybox.width = 10;
        mybox.heigth = 20;
        mybox.depth = 15;
        
        vol = mybox.depth * mybox.heigth * mybox.width;
        
        System.out.println("Volume = " + vol);
    }
}
