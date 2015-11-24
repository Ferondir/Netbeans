

package ttt;


public class Ttt {
    
    

    
    
    
    

    public static void main(String[] args) {
        
        
        
        int z = 5;
        int y = 5;
    
        z = z++;
        y = ++y;
        
        System.out.println("z " + z + "; y " + y + ";");
        
        
       System.out.println(notReplace("is-is"));
       System.out.println(notReplace("This is"));
       System.out.println(notReplace("This is isabell"));
    }
    
public static String notReplace(String str) {
  
  String tmp = "";
  
  for(int i=0; i<str.length(); i++){
   if( i+1 < str.length() && 
       str.substring(i,i+2).equals("is") &&
       (i==0 || !Character.isLetter(str.charAt(i-1)) ) &&
       (i == str.length()-2 || !Character.isLetter(str.charAt(i+2)))
       
       
       ){
    tmp+="is not";
    i+=1;
   } else {
    tmp += str.charAt(i);
   }
  }
  
  return(tmp);
}
   

}