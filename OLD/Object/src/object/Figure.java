/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package object;

/**
 *
 * @author mypc
 */
public abstract class Figure {
    
    double a=0;
    double b=0;
    
    Figure(double a, double b){
        this.a = a;
        this.b = b;
    }
    
    public abstract double getS();
    public abstract double getP();
    
    
}
