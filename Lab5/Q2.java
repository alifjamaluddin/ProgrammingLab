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
public class Q2 {
    
    public static void main(String[] args){
        int[] number = new int[10];
        int counter = 0;
        int temp;
        int c=0;
        Random random = new Random();
        boolean check = true;
        
        int b = 0;
        
        while(counter<10){
        temp = random.nextInt(21);
         c++;   
        for(int i = 0; i<counter;i++){
                if(b==0) continue;
                if(number[i]==temp) check = false;
        }
        if(check) {
        number[b]=temp;
            System.out.println((b+1)+". Get: "+number[b]);
        b++;
        counter++;
        
        }
        check = true;
        }
        System.out.println(c + " loops");
    }
}
