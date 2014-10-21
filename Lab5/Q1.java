
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
public class Q1 {
    public static void main(String[] args){
        int[][] number = new int[3][3];
        int[][] numberx = new int[3][3];
        Random random = new Random();
        for(int i=0;i<number.length;i++)
            for(int x=0;x<number[0].length;x++){
            number[i][x] = random.nextInt(100);
        }
        
        for(int b=0;b<number.length;b++){
         System.out.println("");
            for(int c=0;c<number[0].length;c++){
            System.out.print(number[b][c] + " ");
        }
        }
        
        System.out.println("\n\nRotated:");
        for(int i=0;i<number.length;i++)
            for(int x=0;x<number[0].length;x++){
            numberx[x][i] = number[i][x];
        }
        
        for(int b=0;b<number.length;b++){
         System.out.println("");
            for(int c=0;c<number[0].length;c++){
            System.out.print(numberx[b][c] + " ");
        }
        }
         
        System.out.println("");
        
           
    }
    
}
