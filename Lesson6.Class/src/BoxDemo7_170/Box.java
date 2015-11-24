/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxDemo7_170;

/**
 *
 * @author mypc
 */
public class Box {
    double width;
    double heigth;
    double depth;
    
    //constructor
    Box(double w, double h, double d){
        //System.out.println("Constructing object Box");
        width = w;
        heigth = h;
        depth = d;
    }
        
    double volume(){
        return(this.width * this.heigth * this.depth);
    }
}
