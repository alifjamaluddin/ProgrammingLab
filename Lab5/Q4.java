/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alif
 */

import java.util.*; 



public class Q4 { 
    public static void main(String[] args) { 
        int max = 0;
        int row;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter the number of row of Pascal Triangle to generate: ");
        row = input.nextInt();
        System.out.println("The pascal triangle with " + row + " row(s)");
        int[][] pascal  = new int[row+1][row+1]; //Declare array
        pascal[1][1] = 1;
        for (int i = 2; i <= row; i++) {
            for (int j = 1; j < pascal[i].length; j++) {
                pascal[i][j] = pascal[i-1][j-1] + pascal[i-1][j];
                String str = Integer.toString(pascal[i][j]);
                int len = str.length();
                if (len > max)
                    max = len;
            }
        }


        for (int i = 1; i <= row; i++) {                
            for (int k = row; k > i; k--)System.out.print("");
                //System.out.format("%-" + max + "s", " ");
            for (int j = 1; j < pascal[i].length; j++)                      
                System.out.format("%-" + (max + max) + "s",  pascal[i][j]);
            System.out.println();
        }
    }
}
