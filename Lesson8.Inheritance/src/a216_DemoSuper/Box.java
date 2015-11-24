/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a216_DemoSuper;

/**
 *
 * @author mypc
 */
public class Box {
    private double width;
    private double height;
    private double depth;
    
    
    //clone
    Box(Box ob){
        this.width = ob.width;
        this.height = ob.height;
        this.depth = ob.depth;   
    }
    
    //with parameters
    Box(double w, double h, double d){
        this.width = w;
        this.height = h;
        this.depth = d;
    }
    
    //without parameters
    Box(){
        this(-1, -1, -1);
    }
        
    //cube
    Box(double len){
        this(len, len, len);
    }
    
    double volume(){
        return(width*height*depth);
    }
}
