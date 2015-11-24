package myarraytrytoremeber;

public class Main {

    public static void main(String[] args) {
         ArrayThreads[] at = new  ArrayThreads[3];
         
         at[0] = new  ArrayThreads();
         at[1] = new  ArrayThreads();
         at[2] = new  ArrayThreads();
         
         at[0].start();
         at[1].start();
         at[2].start();
    }
    
}
