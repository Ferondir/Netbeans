/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package fibo;

/**
 *
 * @author mypc
 */
public class Fibonachi {
    
    // 0 1 1 2 3 5 8 13 21 34
    
    
    public static int getFibo(int n){
        
        if(n==0) return(0);
        if(n==1 || n==2) return(1);
        
        return(getFibo(n-1) + getFibo(n-2));
    }
    
    
    //0 1 2 3 5 7 11 13 17 19 23 29
    public static void getSimpleNumber(int n){
       
        int number = 0;
        int simpleCount = 0;
        int numberOfDividesIsNull = 0;
        
        do{
            
            for(int i=2;i<number;i++){
                if(number%i == 0) numberOfDividesIsNull++;
            }
            
            if(numberOfDividesIsNull == 0){
                simpleCount++;
                System.out.println(simpleCount + "; " + number);
            }
            
            numberOfDividesIsNull=0;
                        
            number++;
        }while (true);
        
        //return(n);
    }
    
}
