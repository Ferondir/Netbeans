
package object;

public class Obj {

    public static void main(String[] args) {
        Figure f1,f2;
        
        Squire s = new Squire(5,5);
        System.out.println(s.getClass());
        
        Triangle t = new Triangle(5,5);
        System.out.println(t.getClass());
        
        f1 = s;
        f2 = t;
        
        System.out.println(f1.getP() + " " + f1.getS());
        System.out.println(f2.getP() + " " + f2.getS());
        

        
        Figure fz = new Squire(4,4);
        System.out.println(fz.getP() + " " + fz.getS());
        
       
    }
    
}
