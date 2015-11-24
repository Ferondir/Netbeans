
package multythreads;

public class MultyThreads {

    public static void main(String[] args) {
        NewThread nt = new NewThread();
       
        try {
            for(int i=20;i>0;i--){
                System.out.println("Main thread : " + i);
                Thread.sleep(500);
                if(i==15) nt.start();
            }
            
        } catch (InterruptedException ex) {
            System.out.println("Main thread aborted");
        }
       
        System.out.println("Main thread finished");
       
    }
    
}
