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
public class AbstractAreas {
    public static void main(String[] args){
        Rectangle r = new Rectangle(9,5);
        Triangle t = new Triangle(10, 8);
        
        
        Figure f;
        
        f = r;
        System.out.println("S = " + f.area());
        
        
        f = t;
        System.out.println("S = " + f.area());
        
    }
}
