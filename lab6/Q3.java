/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab6;

/**
 *
 * @author Alif
 */
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class Q3 {
    public static void main(String[] args){
        File file = new File("statement.txt"); 
        int lineCounter = 0;
        int charCounter = 0;
        int wordCounter = 0;
        try{
            Scanner input = new Scanner(file);
            
            String text;
            
            while(input.hasNext()){
                
                wordCounter++;
                text = input.next();
                if(text.equals("\n"))lineCounter++;
                charCounter += text.length();
            } 
        }catch(IOException e){
            System.out.println("IO Exception: " + e.getMessage());
        }
        System.out.println("Line :" + lineCounter);
        System.out.println("Character :" + charCounter);
        System.out.println("Word :" + wordCounter);
    }
}