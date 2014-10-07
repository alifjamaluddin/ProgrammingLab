/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Alif
 */

import java.util.Random;
public class Q5 {
    
    public static void main(String args[]){
        Random random = new Random();
        int anynumber = random.nextInt(10000);// number 0 to 10000
        
        int first, second, third, fourth, fifth,sum;
        
        System.out.println(anynumber);
        
        first = (anynumber/1000);
        second = (anynumber/100)-(anynumber/1000)*10;
        third = (anynumber/10)-(anynumber/100)*10;
        fourth = (anynumber/1)-(anynumber/10)*10;
        sum = first + second + third + fourth;
        
        System.out.printf("First = %d Second = %d Third = %d Fourth = %d%n",first,second,third,fourth);
        System.out.printf("Sum of the number = %d %n",sum);
    }
}
