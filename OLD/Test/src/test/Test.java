/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package test;

import javax.swing.*;

/**
 *
 * @author mypc
 */
public class Test {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("sdffsdf");
        
        JFrame y = new JFrame("Lol");
        y.setVisible(true);
        y.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        y.setSize(200, 200);
        y.setResizable(false);
        
        JButton b = new JButton("lolka");
        b.setSize(3, 3);
        
        y.add(b);
  
        
    }
    
}
