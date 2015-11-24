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
public class Box {
    double width;
    double height;
    double depth;
    
    //clone
    Box(Box ob){
        width = ob.width;
        height = ob.height;
        depth = ob.depth;
    }
    
    //receive all parameters
    Box(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    
    //no parameters
    Box(){
        width = -1;
        height = -1;
        depth = -1;
    }
    
    //cube
    Box(double length){
        this.width = this.height = this.depth = length;
    }
    
    double volume(){
        return(width * depth * height);
    }
    
}
