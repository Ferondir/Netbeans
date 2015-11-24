
package remembersort;

public class RememberSort {

    public static void main(String[] args) {
        
        System.out.print("\n\na1");
        int[] a1 = {1,2,5,7,2,5,2,1,0,7};
        ArrayAll.printArray(a1);
        
        System.out.print("\n\na2");
        int[] a2 = new int[10];
        ArrayAll.fillArray(a2);
        ArrayAll.printArray(a2);
        
        System.out.print("\n\na3");
        int[] a3 = new int[10];
        ArrayAll.fillArray(a3);
        ArrayAll.printArray(a3);
        ArrayAll.reverseArray(a3);
        ArrayAll.printArray(a3);
        
        System.out.print("\n\na4");
        int[] a4 = new int[10];
        ArrayAll.fillArray(a4);
        ArrayAll.printArray(a4);
        ArrayAll.sortBubleArray(a4);
        ArrayAll.printArray(a4);
        
        System.out.print("\n\na5");
        int[] a5 = new int[10];
        ArrayAll.fillArray(a5);
        ArrayAll.printArray(a5);
        ArrayAll.sortSelectionArray(a5);
        ArrayAll.printArray(a5);
        
        System.out.print("\n\na6");
        int[] a6 = new int[10];
        ArrayAll.fillArray(a6);
        ArrayAll.printArray(a6);
        ArrayAll.sortFastArray(a6,0,a6.length-1);
        ArrayAll.printArray(a6);
    }
    
}
