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
import Box.*;

/**
 *
 * @author mypc
 */
public class Box {
    double width;
    double heigth;
    double depth;
    
    double volume(){
        return(this.width * this.heigth * this.depth);
    }
    
    void setDim(double w, double h, double d){
        this.width = w;
        this.heigth = h;
        this.depth = d;
                
    }
}
