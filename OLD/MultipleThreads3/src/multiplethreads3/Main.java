package multiplethreads3;

public class Main {

    public static void main(String[] args) {
       NewThread[] t = new NewThread[4];  
        
       t[0] = new NewThread("1");
       t[1] = new NewThread("2");
       t[2] = new NewThread("3");
       t[3] = new NewThread();
       
       for(NewThread nt : t){
           nt.start();
       }
    }
    
}
