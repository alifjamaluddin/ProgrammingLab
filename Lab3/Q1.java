/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Alif
 */

import java.util.Scanner;

public class Q1 {
    
    public static void main(String args[]){
        int shapeno;
        char operand;
        
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Enter a number to display a shape%n1. Square%n2. Circle%n3. Triangle%n4. Rectangle%n What is the shape you want?%n");
        shapeno = scanner.nextInt();
        
        
        switch(shapeno){
            case 1: System.out.println("Square"); 
                    System.out.println("* * * *");
                    System.out.println("*     *");
                    System.out.println("*     *");
                    System.out.println("* * * *");
                    break;   
            case 2: System.out.println("Circle"); 
                    System.out.println("  ***  ");
                    System.out.println("*     *");
                    System.out.println("*     *");
                    System.out.println("  ***");
                     break;  
            case 3: System.out.println("Triangle"); 
                    System.out.println("   **  ");
                    System.out.println("  *  *");
                    System.out.println(" *    *");
                    System.out.println("*  **  *");
            break;
            case 4: System.out.println("Rectangle"); 
                    System.out.println("* * * * * *");
                    System.out.println("*         *");
                    System.out.println("*         *");
                    System.out.println("* * * * * *");
            break;
            default: System.out.println("Please choose listed shape");
        }
        
        
    }
    
}
