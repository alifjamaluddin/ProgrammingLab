/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

import java.util.Random;
import java.util.Scanner;

/**
 *
 * @author Alif
 */
public class Q5 {
    
    public static void main(String[] args){
        int count = 0, temp = 0;
        int playerA = 0, playerB = 0;
        String enter;
        int MAX = 6;
        int MIN = 1;
        Random rand = new Random();
        Scanner input = new Scanner(System.in);
        while(count<2){
            System.out.println("Player A throw dice");
            enter = input.nextLine();
            temp = rand.nextInt(MAX-MIN)+MIN;
            playerA = playerA + temp;
            System.out.println("Player B throw dice");
            enter = input.nextLine();
            temp = rand.nextInt(MAX-MIN)+MIN;
            playerB = playerB + temp;
            count++;
        }
        
        if (playerA>playerB) System.out.println("Player A win with " + playerA + " points");
        else System.out.println("Player B win with " + playerB + " points");
        
    }
}
