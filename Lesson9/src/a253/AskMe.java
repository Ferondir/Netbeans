/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package a253;

/**
 *
 * @author mypc
 */
public class AskMe implements SharedConstants {
    static void answer(int result){
        switch(result){
            case NO:
                System.out.println("НЕТ");
                break;
            case YES:
                System.out.println("ДА");
                break;
            case MAYBE:
                System.out.println("ВОЗМОЖНО");
                break;
            case LATER:
                System.out.println("ПОЗЖЕ");
                break;
            case SOON:
                System.out.println("СКОРО");
                break;
            case NEVER:
                System.out.println("НИКОГДА");
                break;
        }
    }
    
    public static void main(String[] args){
        Question q = new Question();
        
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
        answer(q.ask());
    }
}
