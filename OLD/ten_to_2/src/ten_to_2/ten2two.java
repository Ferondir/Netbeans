
package ten_to_2;

public class ten2two {
    
    private static int ten2x(int x, int multiply){
        
        int modp=0, mods=0;
        String tmp = "";
        int z = multiply;
        
        do{
            modp = x%z;
            tmp = modp + tmp;
            
            mods = x/z;
            x = mods;
            
        } while (x>0);
        
        //System.out.println(tmp);
        
        x = Integer.parseInt(tmp);
        
        return(x);
    }
    
    private static int x2ten(int x, int multiply){
        
        String tmp = Integer.toString(x);
        int n = 1;
        x = 0;
        int z = multiply;
                
        for(int i=0;i<tmp.length();i++){
            
            x+=Integer.parseInt("" + tmp.charAt(tmp.length() - i - 1)) * n;
            n = n*z;
        }
        
        //System.out.println(x);
        
        return(x);
    }
    
    public static int two2ten(int x){
      return(x2ten(x, 2));  
    };
    
    public static int ten2two(int x){
      return(ten2x(x, 2));  
    };
    
    public static int ten2eight(int x){
      return(ten2x(x, 8));  
    };
    
    public static int eight2ten(int x){
      return(x2ten(x, 8));  
    };
}
