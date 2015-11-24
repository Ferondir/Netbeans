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
public class MissingBreak {
    public static void main(String[] args){
        for(int i=0;i<12;i++){
            switch(i){
                case 0:
                case 1:
                case 2:
                case 3:
                case 4:
                    System.out.println("i < 5");
                    break;
                case 5:
                case 6:
                case 7:
                case 8:
                case 9:
                    System.out.println("i < 10");
                    break;
                default:
                    System.out.println("i >= 10");
            }
        }
    }
}
