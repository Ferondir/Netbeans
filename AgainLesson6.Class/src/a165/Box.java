/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a165;

/**
 *
 * @author Ferondir
 */
public class Box {
    double width;
    double heigth;
    double depth;
    
    double volume(){
        return(this.width * this.heigth * this.depth);
    }
}
