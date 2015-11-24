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
public class BoxWeight extends Box {
    double weight;
    
    //clone
    BoxWeight(BoxWeight ob){
        super(ob);
        this.weight = ob.weight;
    }
    
    //with parameters
    BoxWeight(double w, double h, double d, double m){
        super(w, h, d);
        this.weight = m;
    }
    
    //without parameters
    BoxWeight(){
        super();
        this.weight = -1;
    }
    
    //cube
    BoxWeight(double len, double m){
        super(len);
        this.weight = m;
    }
}
