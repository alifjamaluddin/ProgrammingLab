/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alif
 */

import java.math.BigInteger;
import java.util.Scanner;

public class Q5 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        String num1, num2;
        System.out.println("Number 1:");
        num1 = input.next();
        System.out.println("Number 2:");
        num2 = input.next();
        
        BigInteger bign1 = new BigInteger(num1);
        BigInteger bign2 = new BigInteger(num2);
        BigInteger bign3 = bign1.add(bign2);
        System.out.println("Answer\n" + bign3);
    }
}
