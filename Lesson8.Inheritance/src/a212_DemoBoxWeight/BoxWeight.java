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
public class BoxWeight extends Box {
    double weight;
    
    //constructor
    BoxWeight(double w, double h, double d, double m){
        super.width = w;
        super.height = h;
        super.depth = d;
        this.weight = m;
    }
    
    BoxWeight(){
        
    }
    
}
