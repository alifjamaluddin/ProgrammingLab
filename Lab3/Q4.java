/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package lab3;

/**
 *
 * @author Alif
 */
import java.util.Scanner;
import java.util.Random;
public class Q4 {
    public static void main(String[] args){
        int sale;
        Scanner input = new Scanner(System.in);
        System.out.println("Sale volume = ");
        sale = input.nextInt();
        if(sale>1000) System.out.println("12.5% of total sales");
        else if(sale>500) System.out.println("10% of total sales");
        else if(sale>100) System.out.println("7.5% of total sales");
        else System.out.println("5% of total sales");
    }
}
