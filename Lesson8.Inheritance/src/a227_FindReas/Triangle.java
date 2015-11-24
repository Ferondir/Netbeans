/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a227_FindReas;

/**
 *
 * @author mypc
 */
public class Triangle extends Figure {
    Triangle(double a, double b){
        super(a, b);
    }
    
    @Override
    double area(){
        System.out.println("In class Triangle:");
        return(dim1 * dim2 / 2);
    }
}
