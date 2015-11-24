/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lesson5.handleoperators;

/**
 *
 * @author mypc
 */
public class StringSwitch {
    public static void main(String[] args){
        String str = "два";
        switch (str){
            case "один":
                System.out.println("1");
                break;
            case "два":
                System.out.println("2");
                break;
            case "три":
                System.out.println("3");
                break;
                
            default:
                System.out.println("Whait number is that?");
                break;
        }
    }
}
