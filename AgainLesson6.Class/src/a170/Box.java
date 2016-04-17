/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a170;

/**
 *
 * @author Ferondir
 */
public class Box {
    double width;
    double heigth;
    double depth;
    
    Box(double w, double h, double d){
        this.width = w;
        this.heigth = h;
        this.depth = d;
    }
    
    double volume(){
        return(this.width * this.heigth * this.depth);
    }
}
