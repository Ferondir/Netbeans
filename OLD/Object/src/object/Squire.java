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
public class Squire extends Figure {
    
    Squire(double a, double b){
        super(a,b);
    }
    
    @Override
    public double getS(){
        return(a*b);
    }
    
    @Override
    public double getP(){
        return((a+b)*2);
    }
}
