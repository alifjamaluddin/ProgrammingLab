/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Alif
 */
import java.util.Random;
public class Q5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Game playerA = new Game("Player A");
        Game playerB = new Game("Player B");
        
        boolean turnA = false, turnB = false;
        turnA = true;
        while(playerA.getScore()<100 && playerB.getScore()<100){
            if(turnA){
            playerA.move();
            turnA = false;
            turnB = true;
            }
            if(turnB){
            playerB.move();
            turnA = true;
            turnB = false;
            }
        }
        if(playerA.getScore()>playerB.getScore())System.out.println(playerA.getName() + " win with " + playerA.getScore());
        else System.out.println(playerB.getName() +" win with " + playerB.getScore());
        
        
    }
    
}

class Game{
    String name;
    int score;

    public Game() {
    }
    
    public Game(String name) {
        this.name = name;
        score = 0;
    }
    
    void move(){
        Random rand = new Random();
        int move = rand.nextInt(7);
        score = score + move;
    }

    public int getScore() {
        return score;
    }

    public String getName() {
        return name;
    }    
}
