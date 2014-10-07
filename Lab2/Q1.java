/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alif
 */
public class Q1 {
    
    public static void main(String args[]){
        
        //declare variable
        double degCel, degFah;
        
        //initialize variable
        degCel = 0.0;
        degFah = 75.0;
        
        
        degCel = (degFah-32.0)/1.8;
        
        System.out.printf("The value of %.2f degree fahrenheit is equal to %.2f degree celcius%n",degFah,degCel);
        //ref: http://docs.oracle.com/javase/tutorial/java/data/numberformat.html
    }
    
}
