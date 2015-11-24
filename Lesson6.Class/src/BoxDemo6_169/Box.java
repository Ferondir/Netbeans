/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxDemo6_169;

/**
 *
 * @author mypc
 */
public class Box {
    double width;
    double heigth;
    double depth;
    
    //constructor
    Box(){
        System.out.println("Constructing object Box");
        width = 10;
        heigth = 10;
        depth = 10;
    }
        
    double volume(){
        return(this.width * this.heigth * this.depth);
    }
}
