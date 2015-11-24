package myarray;


public class Main {
    
    public static void main(String[] args){
        int[] arra = new int[5];
        
        arra = Myarray.arrayFill(arra);
        Myarray.arrayPrint(arra);
        
        arra = Myarray.arraySortSelection(arra);
        Myarray.arrayPrint(arra);
        
        arra = Myarray.arrayReverse(arra);
        Myarray.arrayPrint(arra);
        
        arra = Myarray.arrayFill(arra);
        Myarray.arrayPrint(arra);
                
        arra = Myarray.arraySortBubble(arra);
        Myarray.arrayPrint(arra);
        
    }
    
}
