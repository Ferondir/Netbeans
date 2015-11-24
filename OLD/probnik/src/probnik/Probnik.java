package probnik;

import java.util.Scanner;

public class Probnik {

    public static void main(String[] args){
        
            
            String playerChoose;
            String colourPlayer = "";
            
            int minBet = 1;
            int maxBet = 100;
            int playerMoney = 1000;
            int PLAYER_START_MONEY = playerMoney;
            int currentBet = minBet;
            boolean cont = true;
        
        do{
            
            boolean playerChoosIsOk = false;
            String colourCasino = casinoTurn();
            
           do{ 
            
               playerChoosIsOk = false;
               
               System.out.println("Casino\u2122");
               System.out.println("Choose: b)black r)red");
        
               Scanner s = new Scanner(System.in);
               playerChoose = s.next();
               if(playerChoose.equals("b") || playerChoose.equals("r")) playerChoosIsOk = true;
               else System.out.println("-=Error=-");
            } while(!playerChoosIsOk);
        
            if(playerChoose.equals("b")) colourPlayer = "black";
            if(playerChoose.equals("r")) colourPlayer = "red";
           
            System.out.println("You choose is " + colourPlayer + "; Casino turn is " + colourCasino + ";");
            System.out.println("Winner : " + isWinner(colourPlayer, colourCasino));
            
            if(isWinner(colourPlayer, colourCasino)){
                playerMoney +=currentBet;
                System.out.println("Your money is " + playerMoney);
                System.out.println("You win " + (playerMoney - PLAYER_START_MONEY));
                System.out.println("Last bet is " + currentBet);
                System.out.println("STOP");
                cont = false;
            }
            else {
                playerMoney -=currentBet;                
                System.out.println("Your money is " + playerMoney);
                System.out.println("You win " + (playerMoney - PLAYER_START_MONEY));
                System.out.println("Last bet is " + currentBet);
                currentBet = currentBet * 2;
                
                if(playerMoney < currentBet) cont = false;
            }
            
        } while(cont);
    }
    
    public static String casinoTurn(){
        
        String casinoColour = "";
        int e = (int)(Math.random()*2);
        
        if(e == 0) casinoColour = "red";
        else casinoColour = "black";
        
        return(casinoColour);
    }
    
    public static boolean isWinner(String colourPlayer, String colourCasino){
       return(colourPlayer.equals(colourCasino));
    }

}
