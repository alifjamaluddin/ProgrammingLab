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
public class Q3 {
  
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner input = new Scanner(System.in);
        WeightCalculator wc = new WeightCalculator();
        System.out.println("Age");
        int age = input.nextInt();
        System.out.println("Height");
        int height = input.nextInt();
        wc.setAge(age);
        wc.setHeight(height);
        wc.display();
    }
    
}


class WeightCalculator{

    int age;
    int height;
    WeightCalculator(){
        age = 0;
        height = 0;
    }
    
    WeightCalculator(int a, int b){
        age = a;
        height = b;
    }
    
    double recweight(){
        double weight = (height-100 + (age/10))*0.9;
        return weight;
    }
    
    void display(){
        System.out.println("Age \t Height \t Recommended weight");
        System.out.println(age + "\t" + height + "\t\t\t" + recweight());
    }
    
    void setAge(int a){
        age = a;
    }
    
    void setHeight(int b){
        height = b;
    }
    
    
}