/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a163;

/**
 *
 * @author Ferondir
 */
public class Box {
    double width;
    double heigth;
    double depth;
    
    void volume(){
        System.out.print("Volume equals ");
        System.out.println(this.width * this.heigth * this.depth);
    }
}
