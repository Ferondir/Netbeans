/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Box_181;

/**
 *
 * @author mypc
 */
public class Box {
    private double width;
    private double heigth;
    private double depth;
    
    Box(double w, double h, double d){
        width = w;
        heigth = h;
        depth = d;
    }
    
    Box(){
        width = -1;
        heigth = -1;
        depth = -1;
    }
    
    Box(double len){
        this(len,len,len);//width = heigth = depth = len;
    }
    
    public double volume(){
        return(width * heigth * depth);
    }
}
