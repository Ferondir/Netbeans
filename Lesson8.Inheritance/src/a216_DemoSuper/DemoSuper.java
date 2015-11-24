/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a216_DemoSuper;

/**
 *
 * @author mypc
 */
public class DemoSuper {
    public static void main(String[] args){
        BoxWeight myBox1 = new BoxWeight(10, 20, 15, 34.3);
        BoxWeight myBox2 = new BoxWeight(2, 3, 4, 0.076);
        BoxWeight myBox3 = new BoxWeight();
        BoxWeight myCube = new BoxWeight(3, 2);
        BoxWeight myClone = new BoxWeight(myBox1);
        
        double vol;
        
        vol = myBox1.volume();
        System.out.println("myBox1 volume " + vol);
        System.out.println("myBox1 weight " + myBox1.weight);
        System.out.println();
        
        
        vol = myBox2.volume();
        System.out.println("myBox2 volume " + vol);
        System.out.println("myBox2 weight " + myBox2.weight);
        System.out.println();
        
        
        vol = myBox3.volume();
        System.out.println("myBox3 volume " + vol);
        System.out.println("myBox3 weight " + myBox3.weight);
        System.out.println();
        
        
        vol = myClone.volume();
        System.out.println("myClone volume " + vol);
        System.out.println("myClone weight " + myClone.weight);
        System.out.println();
        
        vol = myCube.volume();
        System.out.println("myCube volume " + vol);
        System.out.println("myCube weight " + myCube.weight);
        System.out.println();
        
    }
}
