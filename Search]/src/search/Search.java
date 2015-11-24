/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package search;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.io.LineNumberReader;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author mypc
 */
public class Search {
    private static Object jCheckBox1;

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String str1 = null;
        try {
            LineNumberReader lnr1 = new LineNumberReader(new BufferedReader(new FileReader("C:\\Users\\mypc\\Documents\\NetBeansProjects\\Search]\\src\\search\\file.txt")));           
            Pattern p1 = Pattern.compile(".*sequence*");
            Pattern p2 = Pattern.compile(".*iPBinV4Address*");
            Pattern p3 = Pattern.compile(".*nodeID*");

            while ((str1 = lnr1.readLine()) != null) {
                Matcher m1 = p1.matcher(str1);
                Matcher m2 = p2.matcher(str1);
                Matcher m3 = p3.matcher(str1);          
                if (m1.find()) {
                    System.out.println("\n" + "----------------------------------------------------");
                    System.out.println(str1);
                } 
                if (m2.find()) {
                    System.out.println(str1);
                } 
                if (m3.find()) {
                    System.out.println(str1);
                } 
                
                }
            lnr1.close();
        } catch (IOException ex1) {
            javax.swing.JOptionPane.showMessageDialog(null, "error!");
        }
}
   }
    

