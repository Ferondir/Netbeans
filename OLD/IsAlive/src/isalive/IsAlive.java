package isalive;

public class IsAlive {

    public static void main(String[] args) {
       NewThread[] a = new NewThread[5];
       
        a[0] = new NewThread("lol0");
        a[1] = new NewThread("lol1");
        a[2] = new NewThread("lol2");
        a[3] = new NewThread("lol3");
        a[4] = new NewThread("lol4");
       
        System.out.println("isAlive check:");
        for(NewThread e : a){
            System.out.println( e.getName() + " status isAlive : " + e.t.isAlive());
        }
       
        System.out.println("Wait for threads finish:");
        try{
            for(NewThread e : a){
                e.t.join();
            }
        }catch(Exception e){
            System.out.println(e);
        }
        
        System.out.println("isAlive check:");
        for(NewThread e : a){
            System.out.println( e.getName() + " status isAlive : " + e.t.isAlive());
        }
        
        
       
       
       
    }
    
}
