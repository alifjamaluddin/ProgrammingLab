/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alif
 */

import java.util.Scanner;
import java.math.*;
public class Q6 {
    
    public static void main(String args[]){
        double P, R;
        int N;
        
        Scanner scanner = new Scanner(System.in);
        System.out.println("Value of P, invesment amount");
        P = scanner.nextDouble();
        System.out.println("Value of R, interest rate");
        R = scanner.nextDouble();
        System.out.println("Value of N, year");
        N = scanner.nextInt();
        
        double temp;
        temp = Math.pow(R/100,N+1);
        
        double earn = (P*(1-temp))/(1-(R/100));
        
        System.out.printf("Money earn after %d year is %.2f%n",N, earn);
    }
}
