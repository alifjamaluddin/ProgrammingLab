/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package lab6;


import java.io.FileInputStream;
import java.io.FileNotFoundException;

/**
 *
 * @author Alif
 */
import java.util.Scanner;
public class Q5_1 {
    
    public static void main(String[] args) throws FileNotFoundException{
        Scanner input = new Scanner(new FileInputStream("person.dat"));
        while(input.hasNext()){
            String text = input.next();
            System.out.println(text.getBytes());
        }
    }
}