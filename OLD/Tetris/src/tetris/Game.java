/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetris;

import java.util.Scanner;

/**
 *
 * @author mypc
 */
public class Game {
    
    private int gameMode;
    private Player player1;
    private Player player2;
    
    public void start(){
        
        do{
            System.out.println("Choose game mode:");
            System.out.println("1|PLAYER vs PLAYER");
            System.out.println("2|PLAYER vs COMPUTER");
            System.out.println("0|EXIT");
            System.out.print(":");
            Scanner in = new Scanner(System.in);
            gameMode = in.nextInt();
            
            if(gameMode == 1){
                go();
            } 
            else
            if(gameMode == 2){
                System.out.println("This game mode does not support now!");

            }
            else
            if(gameMode == 0){
                System.out.println("Bye bye!!!");
                break;
            }
            else 
            {
                System.out.println("-----------");
                System.out.println("-E-R-R-O-R-");
                System.out.println("-----------");
            }
            
        } while(true);
        

    }
    
    private void go(){
        Field f = new Field();
        f.fillField();
        f.drawField();
        
        if(gameMode == 1){ //PvP
            player1 = new LivePlayer();
            player2 = new LivePlayer();
        }
        
        
        int turnNumber = 1;
        
        do{
            
            if(turnNumber > (f.getFieldSize()*f.getFieldSize())){
                System.out.println("Too much turns!!!");
                break;
            }
            System.out.println("TurnNumber: " + turnNumber);
            f.drawField();
            
            int xCoodinate;
            int yCoodinate;
            
            if((turnNumber%2)==0){
                System.out.println("Player2 turn:");
                do{
                int coords[] = player2.turn();
                xCoodinate  = coords[0];
                yCoodinate  = coords[1];
                } while (!f.checkTurn(xCoodinate, yCoodinate));
                
                f.turnPlayerTwo(xCoodinate, xCoodinate);
            }
            else {
            if((turnNumber%1)==0){
                System.out.println("Player1 turn:");
                do{
                int coords[] = player1.turn();
                xCoodinate  = coords[0];
                yCoodinate  = coords[1];
                } while (!f.checkTurn(xCoodinate, yCoodinate));
                
                f.turnPlayerOne(xCoodinate, xCoodinate);
            }
            }
            
            turnNumber++;
        } while (true);
        
        System.out.println("-=GAME OVER=-");
    }

}
