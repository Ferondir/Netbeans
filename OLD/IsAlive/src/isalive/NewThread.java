package isalive;

import java.util.Random;

public class NewThread implements Runnable {
    Thread t;
    String name;
    int timer;
    
    NewThread(String threadname){
        t = new Thread(this, threadname);
        System.out.println("Slave thread " + t);
        t.start();
    }
    
    public String getName(){
        return(t.getName());
    }
    
    public void run(){
        try{
            for(int i=0;i<10;i++){
                System.out.println(t.getName() + " " + i);
                Thread.sleep(timer);
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        new NewThread(t.getName() + "-1");
        new NewThread(t.getName() + "-2");
        new NewThread(t.getName() + "-3");
    }
    
    {
        Random r = new Random();
        timer = r.nextInt(6)*200+500;
    }
}
