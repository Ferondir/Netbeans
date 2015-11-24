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
public class ExceptionDemo {

    
    public static void compute(int a) throws Exception{
        System.out.println("compute(" + a + ") : start");
        if (a>10){throw new Exception();} 
        System.out.println("compute(" + a + ") : finish");
    }
    
    public static void main(String[] args) {
        try{
            compute(1);
            compute(20);
        }catch(Exception e){
            System.out.println("main : compute : exception" + e);
        }
    }
    
}
