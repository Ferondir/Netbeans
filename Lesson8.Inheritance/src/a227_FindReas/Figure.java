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
public class Figure {
    double dim1;
    double dim2;
    
    Figure(double a, double b){
        this.dim1 = a;
        this.dim2 = b;
    }
    
    double area(){
        System.out.println("Figure square does't determine");
        return(0);
    }
}
