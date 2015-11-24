package multiplethreads3;

import java.util.Random;

public class NewThread implements Runnable {
    private String threadName;
    private Thread t;
    private int sleepTime;
    
    public NewThread(){
        t = new Thread(this);
    }
    
    public NewThread(String name){
        t = new Thread(this,name);
    }
    
    
    public void start(){
        t.start();
    }
    
    @Override
    public void run(){
        
        System.out.println("Slave thread " + t.getName() + " started");
        
        try {
            for(int i = 10;i>0;i--){
                System.out.println("Slave thread " + t.getName() + " : " + i);
                Thread.sleep(sleepTime);
            }
        } catch (InterruptedException ex) {
            System.out.println("Slave thread aborted");
        }
        
        System.out.println("Slave thread "+ t.getName() +" finished");
    }
    
    {
        Random r = new Random();
        sleepTime = 500 + r.nextInt(20)*100;
        System.out.println(sleepTime);
    }
}
