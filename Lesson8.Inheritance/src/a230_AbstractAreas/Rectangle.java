/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a230_AbstractAreas;

/**
 *
 * @author mypc
 */
public class Rectangle extends Figure {
    
    Rectangle(double a, double b){
        super(a, b);
    }
    
    @Override
    public double area(){
        System.out.println("In Rectangle area");
        return(dim1 * dim2);
    }
}
