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
public class Q2 {
    public static void main(String[] args){
        char operand;
        int no1, no2;
        Scanner input = new Scanner(System.in);
        System.out.println("Number =");
        no1 = input.nextInt();
        System.out.println("Number =");
        no2 = input.nextInt();
        System.out.println("Operand =");
        operand = input.next().charAt(0);
        
        switch(operand){
            case '+' : System.out.println("SUM"); 
                       int sum = no1 + no2;
                       System.out.printf("%d + %d = %d%n",no1,no2,sum);
                       break;
            case '-' : System.out.println("DIFFERENCE"); 
                       int minus = no1 - no2;
                       System.out.printf("%d - %d = %d%n",no1,no2,minus);
                       break;
            case '*' : System.out.println("MULTIPLICATION"); 
                       int mul = no1 * no2;
                       System.out.printf("%d * %d = %d%n",no1,no2,mul);
                       break;
            case '/' : System.out.println("QUOTIENT"); 
                       int div = no1 / no2;
                       System.out.printf("%d / %d = %d%n",no1,no2,div);
                        break;
            case '%' : System.out.println("REMAINDER"); 
                       int rem = no1 % no2;
                       System.out.println(no1 + " % " + no2 + " = " + rem);
                        break;
            default  : System.out.println("WRONG OPERAND");
        }
        
    }
}
