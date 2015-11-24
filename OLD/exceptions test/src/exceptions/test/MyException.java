/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exceptions.test;

/**
 *
 * @author mypc
 */
public class MyException extends Exception{
    
    private int detail;
    
    public MyException(int a){
        detail = a;
    }
    
    public String toString(){
        System.out.println("MyException : start");
        return("MyException[" + detail + "]");
    }
}
