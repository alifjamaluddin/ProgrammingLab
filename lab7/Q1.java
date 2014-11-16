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

import java.util.Random;

public class Q1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Number no1 = new Number(4,50);
        no1.display();
        no1.even();
        no1.max();
        no1.min();
        no1.average();
        no1.square();
        no1.prime();
       
    }
    
}

class Number{

    int limit, no;
    int[] noarray;
    Number(){
        no = 10; 
        limit = 101;
        noarray = new int[no];
        Random rand = new Random();
        for(int i=0;i<no;i++){
            noarray[i] = rand.nextInt(limit);
        }
    }
    
    Number(int a){
        no = a;
        limit = 101;
        noarray = new int[no];
        Random rand = new Random();
        for(int i=0;i<no;i++){
            noarray[i] = rand.nextInt(limit);
        }
        
    }
    
    Number(int a, int b){
        no = a;
        limit = b+1;
        noarray = new int[no];
        Random rand = new Random();
        for(int i=0;i<no;i++){
            noarray[i] = rand.nextInt(limit);
        }
    }
    
    void display(){
        System.out.println("Display array:");
        for(int item: noarray){
            System.out.print(item + " ");
        }
        System.out.println("");
    }
    
    void even(){
        System.out.println("Even no:");
        for(int item: noarray){
            if(item%2==0){
                System.out.print(item + " ");
            } 
        }
        System.out.println("");
    }
    
    void prime(){
        System.out.println("Prime no:");
        for(int item: noarray){
            boolean isPrime = true;
        for(int j=2; j < item ; j++){
             if(item % j == 0){
                isPrime = false;
                break;
                }
            }
        if(isPrime)System.out.print(item + " ");
        }
        System.out.println("");
    }
    
    void max(){
        int max=0;
        System.out.println("Max no:");
        for(int item: noarray){
            if(item>max){
                max = item;                
            }
        }
        System.out.println(max);
    }
    
    void min(){
        int min=noarray[0];
        System.out.println("Min no:");
        for(int item: noarray){
            if(item<min){
                min = item;                
            }
        }
        System.out.println(min);
    }
    
    void average(){
        int average = 0;
        int sum = 0;
        int counter = noarray.length;
        for(int item: noarray){
            sum = sum + item;
        }
         
         average = sum / counter;
         System.out.println("Average:");
         System.out.println(average);
    }
    
    void square(){
        System.out.println("Square no:");
        for(int item: noarray){
            int sq = (int)Math.pow(item, 2);
            System.out.print(sq + " ");
        }
        System.out.println("");
    }
}
