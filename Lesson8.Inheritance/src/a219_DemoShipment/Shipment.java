/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a219_DemoShipment;

/**
 *
 * @author mypc
 */
public class Shipment extends BoxWeight {
    double cost;
    
    //clone
    Shipment(Shipment ob){
        super(ob);
        this.cost = ob.cost;
    }
    
    //with parameters
    Shipment(double w, double h, double d, double m, double c){
        super(w, h, d, m);
        this.cost = c;
    }
    
    //without parameters
    Shipment(){
        super();
        this.cost = -1;
    }
    
    //cube
    Shipment(double len, double m, double c){
        super(len, m);
        this.cost = c;
    }       
}
