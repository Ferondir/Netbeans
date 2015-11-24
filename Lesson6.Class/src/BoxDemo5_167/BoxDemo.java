/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxDemo5_167;

import BoxDemo4_165.*;
import BoxDemo3_163.*;
import BoxDemo2.*;
import BoxDemo.*;

/**
 *
 * @author mypc
 */
public class BoxDemo {
    public static void main(String[] main){
        Box mybox1 = new Box();
        Box mybox2 = new Box();
        
        double vol;
        
        //mybox1
        mybox1.setDim(10, 20, 15);
        
        
        //mybox2
        mybox2.setDim(3, 6, 9);
        
        
        //mybox1
        vol = mybox1.volume();
        System.out.println("mybox1 volume = " + vol);
        
        
        //mybox2
        vol = mybox2.volume();
        System.out.println("mybox2 volume = " + vol);
    }
}
