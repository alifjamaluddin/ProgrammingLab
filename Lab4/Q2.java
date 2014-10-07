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
public class Q2 {
    
    public static void main(String[] args){
        Random rand = new Random();
        int max = 100;
        int min = 1;
        int n = rand.nextInt(max-min)+min;//n prime number
        int a = 0;//counter
        int b = 2;//check prime number start from 2 (1 is not prime number
        
        boolean checkprime = true;
        System.out.println("The list of first " + n + " prime number:");
        
        while(a<n){
            for(int c=1; c<b;c++){
                if(c==1) continue; //bypass no 1
                if(b%c==0) checkprime = false;
                
            }
            if(checkprime){
                System.out.print(b + " ");
                a++;
            }
            b++;
            checkprime = true;
            
        }
        
        System.out.println("");
        
        
        
    }
    
}
