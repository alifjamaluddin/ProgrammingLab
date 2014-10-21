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
public class Q6 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        char type;
        int hour,salary;
        System.out.println("Employee type");
        type = input.next().charAt(0);
        System.out.println("Work hour");
        hour = input.nextInt();
        
        switch(type){
            case 'P':   salary = 200 * hour;
                        System.out.println("Salary =" + salary);
                        break;
            case 'C':   salary = 150 * hour;
                        System.out.println("Salary =" + salary);
                        break;
            case 'T':   salary = 100 * hour;
                        System.out.println("Salary =" + salary);
                        break;
            default: System.out.println("Wrong input");
                
        }
        
    }
}
