/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab4;

/**
 *
 * @author Alif
 */
import java.util.Random;
import java.util.Scanner;
public class Q4 {
    
    public static void main(String[] args){
        int playerA = 0, playerB = 0, MIN = 1, MAX = 7;
        Random random = new Random();
        String enter;
        Scanner scanner = new Scanner(System.in);
        boolean Aturn, Bturn = false;
        System.out.println("Lets start the game");
        Aturn = true;
        do{
            while(Aturn){
                System.out.println("Player A take turn: (A=" + playerA + " B="+ playerB + ")");
                int tempA;
                enter = scanner.nextLine();
                tempA = random.nextInt(MAX-MIN)+MIN;
                System.out.println(tempA);
                playerA = playerA + tempA; 
                if(tempA!=6){
                    Aturn = false;
                    Bturn = true;
                }
            }
            
            while(Bturn){
                System.out.println("Player B take turn: (A=" + playerA + " B="+ playerB + ")");
                int tempB;
                enter = scanner.nextLine();
                tempB = random.nextInt(MAX-MIN)+MIN;
                System.out.println(tempB);
                playerB = playerB + tempB; 
                if(tempB!=6){
                    Aturn = true;
                    Bturn = false;
                }
            
            }
          
        }while(playerA<=10&&playerB<=10);
        
        if(playerA>=10) System.out.println("Player A win with " + playerA + " points");
        if(playerB>=10) System.out.println("Player B win with " + playerB + " points");
        
        
    }
}
