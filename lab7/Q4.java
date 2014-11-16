/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab7;

/**
 *
 * @author Alif
 */
import java.util.Scanner;
public class Q4 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        Fraction fr;
        
            System.out.println("Numerator");
            int nume = input.nextInt();
            System.out.println("Denominator");
            int deno = input.nextInt();
            fr = new Fraction(nume,deno);
            fr.display();
        
        
       
    }
}

class Fraction{

    int numerator;
    int denominator;

    public Fraction() {
    }

    public Fraction(int numerator, int denominator) {
        this.numerator = numerator;
        this.denominator = denominator;
    }

    public int getNumerator() {
        return numerator;
    }

    public int getDenominator() {
        return denominator;
    }

    public void setNumerator(int numerator) {
        this.numerator = numerator;
    }

    public void setDenominator(int denominator) {
        this.denominator = denominator;
    }
    
    void display(){
        int gcd = 0;
        for(int i=1; i<=numerator;i++)
            if(numerator%i==0 && denominator%i==0){
                gcd = i;
            }
        System.out.println("Fraction :" + (numerator/gcd) + "/" + (denominator/gcd));
        
    }
    
}
