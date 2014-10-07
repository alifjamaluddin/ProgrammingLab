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
public class Q6 {
    public static void main(String[] args){
        double P, interest, N, M;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter principal amount:");
        P = input.nextDouble();
        System.out.println("Enter interest in %:");
        interest = input.nextDouble();
        System.out.println("Enter total number of month(s):");
        N = input.nextDouble();
        double a = P*(interest/(12*100));
        double b = 1 - Math.pow(1+(interest/(12*100)), -N);
        M = a/b;
        System.out.println("Month\tMonthly Payment\tPrincipal\tInterest\tUnpaid Balance\tTotal Interest");
        
        double SumI = 0;
        for(int i = 0; i<N;i++){
        double C, L, R;
        C = M * Math.pow(1 + (interest/(12*100)), -(1+N-i));
        L = M-C;
        R = (L/(interest/(12*100)))-C;
        SumI = SumI + L;
            System.out.printf("%d\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\t\t%.2f\n",i,M,C,L,R,SumI);
        }
        
        
    }
}
