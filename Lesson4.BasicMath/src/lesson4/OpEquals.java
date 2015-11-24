/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson4;

/**
 *
 * @author mypc
 */
public class OpEquals {
    
    static int a = 1;
    static int b = 2;
    static int c = 3;
    
    public static void main(String[] args){
        printAll("initialize");
        
        a+=5;
        printAll("a+=5;");
        
        b*=4;
        printAll("b*=4;");
        
        c += a * b;
        printAll("c += a * b;");
        
        c %= 6;
        printAll("c %= 6;");
    }
    
    private static void printAll(String str){
        System.out.println(str);
        System.out.println("-------------");
        System.out.println("a:"+a+"; b:"+b+"; c"+c+";");
        System.out.println("-------------\n");
        
    }
}
