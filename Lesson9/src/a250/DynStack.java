/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a250;

/**
 *
 * @author mypc
 */
public class DynStack implements InStack {
    private int[] stck;
    private int tos;
    
    DynStack(int size){
        stck = new int[size];
        tos = -1;
    }
    
    @Override
    public void push(int item){
        
        //проверяем что есть свободное место в стеке
        if(tos==stck.length-1){ //если нет:
            
            System.out.println("Overloaded. Expanded.");
            
            //создаем массив в два раза большего размера
            //чем первый масив
            int[] tmp = new int[stck.length * 2];
            
            //Перекидываем все элементы из первого массива во второй
            for(int i=0;i<stck.length;i++){
                tmp[i] = stck[i];
            }
            
            stck = tmp;
        }
        
        stck[++tos] = item;
    }
    
    @Override
    public int pop(){
        if(tos<0){
            System.out.println("Stack is empty");
            return(0);
        }
        
        return(stck[tos--]);
    }
    
    public int length(){
        return(tos);
    }
}
