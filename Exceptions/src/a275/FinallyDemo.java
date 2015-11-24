/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a275;

/**
 *
 * @author mypc
 */
public class FinallyDemo{
    static void procA(){    
        try {
            System.out.println("In body of method procA()");
            throw new RuntimeException("DEMO");
        } finally {
            System.out.println("Block of the operator finally in method procA()");
        }
    }
    
    static void procB(){
        try{
            System.out.println("In body of method procB()");
            return;
        }finally{
            System.out.println("Block of operator finally in method procB()");
        }
    }
    
    static void procC(){
        try{
            System.out.println("In body of method procC()");
        }finally{
            System.out.println("Block of operator finally in method procC()");
        }
    }
    
  
    public static void main(String[] args){
        
        try {
            procA();
        } catch (Exception e) {
            System.out.println("Catch exception");
        }

        procB();
        procC();
    }
}
