/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pkg2.pkg1;

/**
 *
 * @author mypc
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        String [] hello = new String[3];
        hello[0] = "Welcome to ";
        hello[1] = "my new try to";
        hello[2] = "learn JAVA!";
        
        for(String e : hello){
            System.out.println(e);
        }
    }
    
}
