/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxDemo3_163;

import BoxDemo2.*;
import BoxDemo.*;
import Box.*;

/**
 *
 * @author mypc
 */
public class Box {
    double width;
    double heigth;
    double depth;
    
    void volume(){
        System.out.print("Volume equals:");
        System.out.println(this.width * this.heigth * this.depth);
    }
}
