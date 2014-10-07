/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alif
 */
public class Q2 {

    public static void main(String args[]){
        
        //declare variable
        double P, D, R, M;
        int Y;
        
        //initialize variable
        P = 132000.0;
        D = 1000.0;
        R = 2.0;
        M = 0;
        Y = 5;
        
        //M =  (P-D)*(1+R*Y/100)/(Y*12)
        
        double part1 = P-D;
        double part2 = 1 + ((R*Y)/100);
        double part3 = Y*12;
        
        M = part1 * part2/part3;
    
        System.out.printf("The monthly payment is RM %.2f%n",M);
    }
    
}
