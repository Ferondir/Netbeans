package multythreadsthrow;

public class NewThread extends Thread {
    
    NewThread(){
        super("Demonstrate Thread");
        System.out.println("Slave thread started" + this);
        super.start();
    }
    
    @Override
    public void run(){
        try {
            for(int i=5;i>0;i--){
                System.out.println("Slave thread : " + i);
                Thread.sleep(500);
            }
            
        } catch (InterruptedException ex) {
            System.out.println("Slave thread aborted");
        }
        
        System.out.println("Slave thread finished" + this);
    }
    
}
