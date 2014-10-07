/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alif
 */

import java.util.Random;


public class Q3 {
    
    public static void main(String args[]){
        //Initialize Random class, call constructor
        Random random = new Random();
        
        //declare and initialize 
        int bound = 100;
        int randno1 = random.nextInt(bound);
        int randno2 = random.nextInt(bound);
        int randno3 = random.nextInt(bound);
        double avgno = (randno1 + randno2 + randno3)/3;
        
        System.out.printf("Number = %d Number = %d Number = %d %nAverage number = %.2f %n",randno1,randno2,randno3,avgno);
        
        
    }
    
}
