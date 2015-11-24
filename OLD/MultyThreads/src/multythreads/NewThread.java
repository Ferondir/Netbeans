package multythreads;

public class NewThread implements Runnable {

    public NewThread(){
        
        //t.start();
        
    }
    
    public void start(){
        System.out.println("Demonstration thread created");
        Thread t = new Thread(this,"Demonstration thread");
        t.start();
    }
    
    @Override
    public void run() {
        try {
            for(int i=25;i>0;i--){
                System.out.println("Slave thread : " + i);
                Thread.sleep(1000);
            }
            
        } catch (InterruptedException ex) {
            System.out.println("Slave thread aborted");
        }
        
        System.out.println("Slave thread finished");
    }
    
}
