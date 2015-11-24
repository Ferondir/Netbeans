/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package printnumber;

import java.util.Scanner;

/**
 *
 * @author mypc
 */
public class PrintNumber {

    static String[] stri = new String[7];
    static String tempNumber;
    
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        stri[0] = " ";
        stri[1] = " ";
        stri[2] = " ";
        stri[3] = " ";
        stri[4] = " ";
        stri[5] = " ";
        stri[6] = " ";
        
        
        System.out.print("Enter number:\n>");
        readUser();
        
        generateNumber();
        
        printString();
        
        
    }
    
    public static void printString(){
        for(String tmp : stri){
            System.out.println(tmp);
        }
    }
    
    public static void readUser(){
        
        Scanner in = new Scanner(System.in);
        tempNumber = in.next();

    }
    
    public static void generateNumber(){
        String num = tempNumber;

        for(int i=0; i<num.length();i++){
            
            //0
            if(num.charAt(i) == '0'){
                stri[0] += " 00000";
                stri[1] += " 0   0";
                stri[2] += " 0   0";
                stri[3] += " 0   0";
                stri[4] += " 0   0";
                stri[5] += " 0   0";
                stri[6] += " 00000";
            }
            
            //1
            if(num.charAt(i) == '1'){
                stri[0] += "   1  ";
                stri[1] += "  11  ";
                stri[2] += " 1 1  ";
                stri[3] += "   1  ";
                stri[4] += "   1  ";
                stri[5] += "   1  ";
                stri[6] += "   1  ";
            }
            
            //2
            if(num.charAt(i) == '2'){
                stri[0] += " 22222";
                stri[1] += "     2";
                stri[2] += "     2";
                stri[3] += " 22222";
                stri[4] += " 2    ";
                stri[5] += " 2    ";
                stri[6] += " 22222";
            }
            
            //3
            if(num.charAt(i) == '3'){
                stri[0] += " 33333";
                stri[1] += "     3";
                stri[2] += "     3";
                stri[3] += " 33333";
                stri[4] += "     3";
                stri[5] += "     3";
                stri[6] += " 33333";
            }
                     
            //4
            if(num.charAt(i) == '4'){
                stri[0] += " 4   4";
                stri[1] += " 4   4";
                stri[2] += " 4   4";
                stri[3] += " 44444";
                stri[4] += "     4";
                stri[5] += "     4";
                stri[6] += "     4";
            }
            
            //5
            if(num.charAt(i) == '5'){
                stri[0] += " 55555";
                stri[1] += " 5    ";
                stri[2] += " 5    ";
                stri[3] += " 55555";
                stri[4] += "     5";
                stri[5] += "     5";
                stri[6] += " 55555";
            }
            
            //6
            if(num.charAt(i) == '6'){
                stri[0] += " 66666";
                stri[1] += " 6    ";
                stri[2] += " 6    ";
                stri[3] += " 66666";
                stri[4] += " 6   6";
                stri[5] += " 6   6";
                stri[6] += " 66666";
            }
            
            //7
            if(num.charAt(i) == '7'){
                stri[0] += " 77777";
                stri[1] += " 7   7";
                stri[2] += "     7";
                stri[3] += "    7 ";
                stri[4] += "    7 ";
                stri[5] += "   7  ";
                stri[6] += "   7  ";
            }
            
             //8
            if(num.charAt(i) == '8'){
                stri[0] += " 88888";
                stri[1] += " 8   8";
                stri[2] += " 8   8";
                stri[3] += " 88888";
                stri[4] += " 8   8";
                stri[5] += " 8   8";
                stri[6] += " 88888";
            }
            
            //9
            if(num.charAt(i) == '9'){
                stri[0] += " 99999";
                stri[1] += " 9   9";
                stri[2] += " 9   9";
                stri[3] += " 99999";
                stri[4] += "     9";
                stri[5] += "     9";
                stri[6] += " 99999";
            }
            
            //.
            if(num.charAt(i) == '.'){
                stri[0] += "   ";
                stri[1] += "   ";
                stri[2] += "   ";
                stri[3] += "   ";
                stri[4] += "   ";
                stri[5] += " ..";
                stri[6] += " ..";
            }
            
            //+
            if(num.charAt(i) == '+'){
                stri[0] += "      ";
                stri[1] += "   +  ";
                stri[2] += "   +  ";
                stri[3] += " +++++";
                stri[4] += "   +  ";
                stri[5] += "   +  ";
                stri[6] += "      ";
            }
            
        }
    }
    
}
