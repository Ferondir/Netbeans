package myarraytrytoremeber;

public class ArrayThreads implements Runnable {
    
    Thread t;
    
    
    public void start(){
        t = new Thread(this);
        t.start();
    }

    @Override
    public void run() {
        int[] ar = new int[10];
        
        try{
            MyArray.fillArray(ar);
            MyArray.printArray(ar, t.toString());
            Thread.sleep(1000);

            MyArray.reverseArray(ar);
            MyArray.printArray(ar, t.toString());
            Thread.sleep(1000);

            MyArray.sortArraySelection(ar);
            MyArray.printArray(ar, t.toString());
            Thread.sleep(1000);

            MyArray.fillArray(ar);
            MyArray.printArray(ar, t.toString());
            Thread.sleep(1000);

            MyArray.sortArrayBubble(ar);
            MyArray.printArray(ar, t.toString());
            Thread.sleep(1000);

            MyArray.fillArray(ar);
            MyArray.printArray(ar, t.toString());
            Thread.sleep(1000);

            MyArray.sortArrayFast(ar);
            MyArray.printArray(ar, t.toString());
            Thread.sleep(1000);
        } catch(Exception e){
            
        }
    }
    
}
