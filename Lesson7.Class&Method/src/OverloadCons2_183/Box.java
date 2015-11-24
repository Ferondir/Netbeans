/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package OverloadCons2_183;

/**
 *
 * @author mypc
 */
public class Box {
    private double width;
    private double length;
    private double depth;
    
    Box(double w, double l, double d){
        this.width = w;
        this.length = l;
        this.depth = d;
    }
    
    Box(Box ob){
        this(ob.width, ob.length, ob.depth);
    }
    
    Box(double len){
        this(len, len, len);
    }
    
    Box(){
        this(-1, -1, -1);
    }
    
    double volume(){
        return(this.width * this.length * this.depth);
    }
}
