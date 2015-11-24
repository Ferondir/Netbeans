/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package tetris;

/**
 *
 * @author mypc
 */
public class Field {
    
    private final int SIZE = 3;
    private final char[][] FIELD = new char[SIZE][SIZE];
    private final char DEFAULTCHAR = '#';
    private final char PLAYERONE_DEFAULTCHAR = 'x';
    private final char PLAYERTWO_DEFAULTCHAR = 'o';
    
    public void turnPlayerOne(int row, int column){
        turnPlayer(row, column, PLAYERONE_DEFAULTCHAR);
    }
    
    public void turnPlayerTwo(int row, int column){
        turnPlayer(row, column, PLAYERTWO_DEFAULTCHAR);
    }
    
    public int getFieldSize(){
        return FIELD.length;
    }
        
    public void drawField(){
        for(int i=0; i<FIELD.length;i++){
            drawRow(i);
            System.out.print("\n");
        }
        
        for(int i=0; i<FIELD.length;i++){
           System.out.print("-"); 
        }
        
        System.out.print("\n");
    }
    
        
    private void drawRow(int rowNumber){
        for(int i=0; i<FIELD[rowNumber].length;i++){
            System.out.print(FIELD[rowNumber][i]);
        }
    }
    
    private void turnPlayer(int row, int column, char ch){
        FIELD[row][column] = ch;
    }
    
    private void fillField(char ch){
        for(int i=0; i<FIELD.length; i++){
            for(int j=0; j<FIELD[i].length;j++){
                FIELD[i][j] = ch;
            }
        }       
    }
    
    public void fillField(){
        fillField(DEFAULTCHAR);
    }
    
    public boolean checkTurn(int row, int column){
        if (FIELD[row][column] == DEFAULTCHAR){
            return (true);
        }
        
        if (row > SIZE){
            System.out.println("Coordinate is out of range");
            return (false);
        }
        
        if (column > SIZE){
            System.out.println("Coordinate is out of range");
            return (false);
        }
        
        if (FIELD[row][column] != DEFAULTCHAR){
            System.out.println("Wrong turn. This side has already used!");
            return (false);
        }
        
        
        return (false);
    }
}
