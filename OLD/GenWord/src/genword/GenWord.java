/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package genword;

import java.io.IOException;
import java.nio.file.Paths;
import java.util.Scanner;

/**
 *
 * @author mypc
 */
public class GenWord {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        Scanner in = new Scanner(Paths.get("C:/Users/mypc/Documents/NetBeansProjects/GenWord/src/genword/test.txt"));
        
        while(in.hasNext()==true){
            System.out.println(in.next());
        }
        
    }
    
}
