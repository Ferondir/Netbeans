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
public class FindAreas {
    public static void main(String[] args){
        Figure f = new Figure(10, 10);
        Rectangle r = new Rectangle(9, 5);
        Triangle t = new Triangle(10, 8);
        
        Figure tmp;
        
        tmp = f;
        System.out.println("Square equals " + tmp.area());
        
        tmp = r;
        System.out.println("Square equals " + tmp.area());
        
        tmp = t;
        System.out.println("Square equals " + tmp.area());
    }
}
