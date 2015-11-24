/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package threads;

/**
 *
 * @author mypc
 */
public class Threads {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Thread t = Thread.currentThread();
        System.out.println("my thread is " + t);
        
        t.setName("newThread");
        System.out.println("my thread is " + t);
        
        try{
            for(int i=0;i<20;i++){
                System.out.println(i);
                Thread.sleep(200);

            }
        }catch(Exception e){
            System.out.println("Exception is " + e);
        } 
    }
    
}
