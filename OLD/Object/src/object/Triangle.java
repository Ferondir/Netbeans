
package object;

public class Triangle extends Figure {
    Triangle(double a, double b){
        super(a,b);
    }
    
    @Override
    public double getS(){
        return(a*b/2);
    }
    
    @Override
    public double getP(){
        return(a+b+Math.sqrt(a*a+b*b));
    }
}
