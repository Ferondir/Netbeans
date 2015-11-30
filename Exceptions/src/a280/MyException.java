/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a280;

/**
 *
 * @author mypc
 */
public class MyException extends Exception {
    
    private int detail;
    
    MyException(int a){
        this.detail = a;
    }
    
    public String toString(){
        return("ERROR " + detail);
    }
}
