/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxDemo3_163;

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
        mybox1.width = 10;
        mybox1.heigth = 20;
        mybox1.depth = 15;
        
        
        //mybox2
        mybox2.width = 3;
        mybox2.heigth = 6;
        mybox2.depth = 9;
        
        
        //mybox1
        mybox1.volume();
        
        
        //mybox2
        mybox2.volume();
    }
}
