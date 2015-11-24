/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BoxDemo7_170;
/**
 *
 * @author mypc
 */
public class BoxDemo {
    public static void main(String[] main){
        Box mybox1 = new Box(10, 20, 15);
        Box mybox2 = new Box(3, 6, 9);
        
        double vol;
        
        //mybox1
        //mybox2
           
        
        //mybox1
        vol = mybox1.volume();
        System.out.println("mybox1 volume = " + vol);
        
        
        //mybox2
        vol = mybox2.volume();
        System.out.println("mybox2 volume = " + vol);
    }
}
