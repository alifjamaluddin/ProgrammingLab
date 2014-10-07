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

import java.util.Scanner;
public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        int a;
        System.out.print("Enter an integer:");
        a = input.nextInt();
        System.out.println("The factor are:");
        
        for(int i=1; i<=a;i++){
            if(a%i==0){
                if(a==i) System.out.print(i);
                    else
                        System.out.print(i + ",");
                
            }
        }
        System.out.println();
        
    }
    
}
