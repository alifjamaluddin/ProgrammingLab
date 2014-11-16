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
import java.util.Scanner;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.PrintWriter;

public class Q2 {
    public static void main(String[] args){
        //String text = "abcdefghijklmnopqrstuvwxyz";
        try{
        FileInputStream filein = new FileInputStream("statement.txt");
        Scanner input = new Scanner(filein);
        File fileout = new File("reverse.txt");
        PrintWriter output = new PrintWriter(fileout);
        String text;
        
        int length;
        while(input.hasNext()){
            text = input.next();
            length = text.length();
             
            char[] rev = new char[length];
            for(int a=0; a<length;a++) rev[a]= text.charAt(a);
            for(int i=length-1;i>=0;i--){
                output.print(rev[i]);
                
            }
            output.println("");
        }
        output.close();
        }catch(IOException e){
            System.out.println("IO Exception" + e.getMessage());
        }
    }
}
