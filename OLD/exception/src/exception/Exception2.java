package exception;

import java.util.Date;
import java.util.GregorianCalendar;
import java.util.Random;

public class Exception2 {

    public static void main(String[] args) {
        
        System.out.println(args.length);
        for(String n : args){
            
            System.out.println(n);
            
        }
        
        
        
        int a=0, b=0, c=0;
        
        Random r = new Random();
        for(int i=0;i<32000;i++){
            try{            
                b = r.nextInt();
                c = r.nextInt();
                a = 12345 / (b / c);
            } catch(Exception e){
                System.out.println("-=ERROR=- | " + e);
                a = 0;
            }
            
            System.out.println("a = " + a);
        }
    }

}
