/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a169;

/**
 *
 * @author Ferondir
 */
public class Box {
    
    double width;
    double heigth;
    double depth;
    
    Box(){
        System.out.println("Constructor pf the object Box");
        this.width = 10;
        this.heigth = 10;
        this.depth = 10;
    }
    
    double volume(){
        return(this.width * this.heigth * this.depth);
    }
}
