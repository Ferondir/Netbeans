package multythreadsthrow;

public class MultyThreadsThrow {

    public static void main(String[] args) {
        new NewThread();
        
        try {
            for(int i=5;i>0;i--){
                System.out.println("Master thread : " + i);
                Thread.sleep(1000);
            }
            
        } catch (InterruptedException ex) {
            System.out.println("Master thread aborted");
        }
        
        System.out.println("Master thread finished");
    }
    
}
