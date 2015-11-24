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
public class IfElse {
    public static void main(String[] args){
        int month = 4;
        String season;
        
        if(month == 12 || month == 1  || month == 2) season = "зиме";
        else if(month == 3  || month == 4  || month == 5) season = "весне";
        else if(month == 6  || month == 7  || month == 8) season = "лету";
        else if(month == 9  || month == 10 || month == 11) season = "осени";
        else season = "вымышленному времени года";
        
        System.out.println(month + " месяц относится к " + season + ".");
    }
}
