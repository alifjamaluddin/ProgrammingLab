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
public class Q3 {
    
    public static void main(String[] args){
        int tempno=0;
        int min, max;
        double s,sumsq = 0.0, average = 0.0;
        int sum = 0;
        int counter = 0;
        
        
        
        
        
        Scanner input =new Scanner(System.in);
         System.out.print("Enter a score [ A negative number to Quit]:");
            tempno = input.nextInt();
            
            min = tempno;
            max = tempno;
        do{
           
            counter++;
            if(tempno<min)min = tempno;
            if(tempno>max)max = tempno;
            sum = sum + tempno;
            sumsq = sumsq + Math.pow(tempno, 2.0);
            double inner =  (sumsq - (Math.pow(sum, 2.0)/counter))/(counter-1);
            s =  Math.sqrt(inner);
            average = sum/counter;
            System.out.print("Enter a score [ A negative number to Quit]:");
            tempno = input.nextInt();
            
        }while(tempno>=0);
        
        System.out.println("Maximum score:" + max);
        System.out.println("Minimum score:" + min);
        System.out.println("Average score:" + average);
        System.out.printf("Standard deviation: %.2f%n",s);
        
    }
    
    
    
    
    
}
