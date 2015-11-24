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
public class SampleSwitch {
    public static void main(String[] args){
        for(int i=0;i<6;i++){
            switch(i){
                case 0:
                    System.out.println("i = 0");
                    break;
                case 1:
                    System.out.println("i = 1");
                    break;
                default:
                    System.out.println("i>1");
                    break;
            }
        }
    }
}
